package Cuestionario;


import java.util.List;

public class Cuestionario {
    private List<Pregunta> preguntas;
    private List<Respuesta> respuestas;

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public void responder(int indicePregunta, int indiceRespuesta) {
        respuestas.add(new Respuesta(indicePregunta, indiceRespuesta));
    }

    public int calcularPorcentaje() {
        int respuestasCorrectas = 0;

        for(int i = 0; i < respuestas.size(); i++) {
            Pregunta pregunta = preguntas.get(respuestas.get(i).obtenerIndicePregunta());

            if(pregunta.getRespuestaCorrecta() == respuestas.get(i).obtenerIndiceRespuesta()) {
                respuestasCorrectas++;
            }
        }

        return (respuestasCorrectas * 100) / preguntas.size();
    }
}
