package models.entities.Cuestionario;

import java.util.List;

public class Pregunta {
    private String pregunta;
    private String foto; //Ruta a la foto asociada a la pregunta, puede ser nulo
    private List<String> opciones;
    private int respuestaCorrecta; //Indice dentro de la lista de opciones para la respuesta correcta

    public Pregunta(String pregunta, String foto, List<String> opciones, int respuestaCorrecta) {
        this.pregunta = pregunta;
        this.foto = foto;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Pregunta(String pregunta, List<String> opciones, int respuestaCorrecta) {
        this(pregunta, null, opciones, respuestaCorrecta);
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getFoto() {
        return foto;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public Boolean tieneFoto() {
        return foto != null;
    }

}
