package ejercicio17;

/**
 *
 * @author
 */
public class Enunciado {

    // Atributos
    
    private String pregunta;
    private String respuesta;
    
    // Constructores

    public Enunciado() {
        pregunta = "";
        respuesta = "";
    }

    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    // Get & Sett
    
    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    // Mostrar

    @Override
    public String toString() {
        return "Enunciado{" + "pregunta=" + pregunta + ", respuesta=" + respuesta + '}';
    }
    
    // Otros métodos
    
    
    
    
}
