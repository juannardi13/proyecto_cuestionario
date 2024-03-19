package models.entities.org.example;

import models.entities.Cuestionario.Cuestionario;
import models.entities.Cuestionario.Pregunta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        inicializarCuestionarioPrueba();
    }

    public static void inicializarCuestionarioPrueba() {

        Pregunta pregunta1 = new Pregunta("¿Cual es la capital de Buenos Aires?",
                List.of(new String[]{"a. Buenos Aires", "b. Mar del Plata", "c. La Plata", "d. CABA"}),
                2);

        Pregunta pregunta2 = new Pregunta("¿Quién compuso Angeleyes?",
                List.of(new String[]{"a. The Beatles", "b. ABBA", "c. Elton John", "d. Lionel Ritchie"}),
                1);

    }
}