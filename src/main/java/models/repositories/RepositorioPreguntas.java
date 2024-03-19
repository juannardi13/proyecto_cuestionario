package models.repositories;

import models.entities.Cuestionario.Pregunta;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPreguntas {
    public List<Pregunta> buscarTodos() {
        List<Pregunta> preguntas = new ArrayList<>();

        Pregunta pregunta1 = new Pregunta("¿Cual es la capital de Buenos Aires?",
                List.of(new String[]{"a. Buenos Aires", "b. Mar del Plata", "c. La Plata", "d. CABA"}),
                2);

        Pregunta pregunta2 = new Pregunta("¿Quién compuso Angeleyes?",
                List.of(new String[]{"a. The Beatles", "b. ABBA", "c. Elton John", "d. Lionel Ritchie"}),
                1);

        Pregunta pregunta3 = new Pregunta("¿Qué materias curso los jueves?",
                List.of(new String[]{"a. Matemática Superior y Física II", "b. ADR y Física II", "c. DDS y Matemática Superior", "d. Ninguna"}),
                 0);

        Pregunta pregunta4 = new Pregunta("¿Qué materia curso los miércoles?",
                List.of(new String[]{"a. ADR", "b. Matemática Superior", "c. Administración Estratégica del Capital Humano", "d. Ninguna"}),
                3);

        Pregunta pregunta5 = new Pregunta("¿Qué materia curso los viernes?",
                List.of(new String[]{"a. ADR", "b. Matemática Superior", "c. Administración Estratégica del Capital Humano", "d. Ninguna"}),
                2);

        Pregunta pregunta6 = new Pregunta("¿Qué materia curso los lunes?",
                List.of(new String[]{"a. Ingenieria de Software", "b. DDS", "c. Inglés II", "d. Ninguna"}),
                3);

        preguntas.add(pregunta1);
        preguntas.add(pregunta2);
        preguntas.add(pregunta3);
        preguntas.add(pregunta4);
        preguntas.add(pregunta5);
        preguntas.add(pregunta6);

        return preguntas;
    }
}
