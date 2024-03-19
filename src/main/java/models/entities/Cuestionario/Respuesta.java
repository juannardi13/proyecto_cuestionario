package models.entities.Cuestionario;

public class Respuesta {
    private int indicePregunta;
    private int indiceRespuesta;

    public Respuesta(int indicePregunta, int indiceRespuesta) {
        this.indicePregunta = indicePregunta;
        this.indiceRespuesta = indiceRespuesta;
    }

    public int obtenerIndicePregunta() {
        return indicePregunta;
    }

    public int obtenerIndiceRespuesta() {
        return indiceRespuesta;
    }
}
