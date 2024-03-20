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
        model.put("tieneFoto", primeraPregunta.tieneFoto());
        model.put("foto", primeraPregunta.getFoto());
        model.put("preguntaActual", cuestionario.getPreguntaActual() + 1);
        model.put("cantidadPreguntas", cuestionario.cantidadPreguntas());
        ctx.render("/pregunta.hbs", model);

    }

    public void procesarRespuesta(Context ctx) {
        Cuestionario cuestionario = ctx.sessionAttribute("cuestionario");

        int indiceSeleccionado = Integer.parseInt(ctx.formParam("indice"));

        cuestionario.responder(cuestionario.getPreguntaActual(), indiceSeleccionado);

        cuestionario.avanzarProximaPregunta();

        // Obtener la siguiente pregunta del cuestionario
        if(!cuestionario.estaCompleto()) {
            Pregunta siguientePregunta = cuestionario.obtenerPregunta(cuestionario.getPreguntaActual());

            // Renderizar la vista Handlebars con los datos de la siguiente pregunta
            Map<String, Object> model = new HashMap<>();
            model.put("pregunta", siguientePregunta.getPregunta());
            model.put("opciones", siguientePregunta.getOpciones());
            model.put("tieneFoto", siguientePregunta.tieneFoto());
            model.put("foto", siguientePregunta.getFoto());
            model.put("completo", cuestionario.esUltimaPregunta());
            model.put("preguntaActual", cuestionario.getPreguntaActual() + 1);
            model.put("cantidadPreguntas", cuestionario.cantidadPreguntas());
            ctx.render("/pregunta.hbs", model);
        } else {
            ctx.sessionAttribute("cuestionario", null);

            Map<String, Object> model = new HashMap<>();
            model.put("porcentaje", cuestionario.calcularPorcentaje());
            model.put("aprobado", cuestionario.estaAprobado());
            ctx.render("/resultado.hbs", model);
        }

    }

}
