package controllers;

import io.javalin.http.Context;
import models.entities.Cuestionario.Cuestionario;
import models.entities.Cuestionario.Pregunta;
import models.repositories.RepositorioPreguntas;

import java.util.*;

public class CuestionarioController {

    public void primeraPregunta(Context ctx) {
        List<Pregunta> preguntas = new ArrayList<>();
        preguntas = new RepositorioPreguntas().buscarTodos();

        //TODO seleccionar las preguntas al azar

        Cuestionario cuestionario = ctx.sessionAttribute("cuestionario");

        if (cuestionario == null) {

            Collections.shuffle(preguntas);
            List<Pregunta> seleccionadas = preguntas.subList(0, 40);

            cuestionario = new Cuestionario(seleccionadas);
            ctx.sessionAttribute("cuestionario", cuestionario);
        }

        cuestionario.setPreguntaActual(0);

        Pregunta primeraPregunta = cuestionario.obtenerPregunta(cuestionario.getPreguntaActual());

        Map<String, Object> model = new HashMap<>();
        model.put("pregunta", primeraPregunta.getPregunta());
        model.put("opciones", primeraPregunta.getOpciones());
        model.put("tieneFoto", primeraPregunta.tieneFoto());
        model.put("foto", primeraPregunta.getFoto());
        model.put("respuestaCorrecta", primeraPregunta.getRespuestaCorrecta());
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
            model.put("respuestaCorrecta", siguientePregunta.getRespuestaCorrecta());
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
