package ejercicio9;

/**
 *
 * @author Borja Romero
 */
public class Asignatura {

    private String nombreAsignatura;
    private float nota;

    public Asignatura() {
        nombreAsignatura = "";
        nota = 0;
    }

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombreAsignatura=" + nombreAsignatura + ", nota=" + nota + '}';
    }

}
