package controllers;

import io.javalin.http.Context;
import models.entities.Cuestionario.Cuestionario;
import models.entities.Cuestionario.Pregunta;
import models.repositories.RepositorioPreguntas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuestionarioController {

    public void primeraPregunta(Context ctx) {
        List<Pregunta> preguntas = new ArrayList<>();
        preguntas = new RepositorioPreguntas().buscarTodos();

        //TODO seleccionar las preguntas al azar

        Cuestionario cuestionario = ctx.sessionAttribute("cuestionario");

        if (cuestionario == null) {
            // Si no hay cuestionario en la sesión, crea uno nuevo
            cuestionario = new Cuestionario(preguntas);
            // Guarda el cuestionario en la sesión
            ctx.sessionAttribute("cuestionario", cuestionario);
        }

        cuestionario.setPreguntaActual(0);

        Pregunta primeraPregunta = cuestionario.obtenerPregunta(cuestionario.getPreguntaActual());

        Map<String, Object> model = new HashMap<>();
        model.put("pregunta", primeraPregunta.getPregunta());
        model.put("opciones", primeraPregunta.getOpciones());
        ctx.render("/pregunta.hbs", model);

    }

    public void procesarRespuesta(Context ctx) {
        Cuestionario cuestionario = ctx.sessionAttribute("cuestionario");

        int indiceSeleccionado = Integer.parseInt(ctx.formParam("indice"));

        cuestionario.responder(cuestionario.getPreguntaActual(), indiceSeleccionado);

        cuestionario.avanzarProximaPregunta();

        // Obtener la siguiente pregunta del cuestionario
        Pregunta siguientePregunta = cuestionario.obtenerPregunta(cuestionario.getPreguntaActual());

        // Renderizar la vista Handlebars con los datos de la siguiente pregunta
        Map<String, Object> model = new HashMap<>();
        model.put("pregunta", siguientePregunta.getPregunta());
        model.put("opciones", siguientePregunta.getOpciones());
        ctx.render("/pregunta.hbs", model);
    }
}
