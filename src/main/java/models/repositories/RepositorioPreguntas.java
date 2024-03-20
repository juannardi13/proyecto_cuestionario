package models.repositories;

import models.entities.Cuestionario.Pregunta;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPreguntas {
    public List<Pregunta> buscarTodos() {
        List<Pregunta> preguntas = new ArrayList<>();

        //Preguntas de prueba

        Pregunta preguntaPrueba = new Pregunta("¿Quién compuso Angeleyes?", "/images/ABBA.jpg",
                List.of(new String[]{"a. The Beatles", "b. ABBA", "c. Elton John", "d. Lionel Ritchie"}),
                1);

        //preguntas.add(preguntaPrueba);



        return preguntas;
    }
}
