package models.entities.Cuestionario;


import java.util.ArrayList;
import java.util.List;

public class Cuestionario {
    private List<Pregunta> preguntas;
    private List<Respuesta> respuestas;
    private int preguntaActual;

    public Cuestionario(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
        this.respuestas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public Pregunta obtenerPregunta(int indice) {
        return preguntas.get(indice);
    }

    public int getPreguntaActual() {
        return this.preguntaActual;
    }

    public void setPreguntaActual(int indice) {
        this.preguntaActual = indice;
    }

    public void avanzarProximaPregunta() {
        preguntaActual++;
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

    public Boolean estaAprobado() {
        return this.calcularPorcentaje() > 80;
    }

    public Boolean estaCompleto() {
        return preguntaActual == preguntas.size();
    }

    public Boolean esUltimaPregunta() {
        return preguntaActual == preguntas.size() - 1;
    }

    public int cantidadPreguntas() {
        return preguntas.size();
    }
}
