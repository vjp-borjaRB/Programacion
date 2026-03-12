package ejercicio14;

/**
 *
 * @author Borja Romero
 */
public class Asignatura {

    // Atributos
    private String nombre;
    private float nota;

    //Constructores
    public Asignatura() {
        nombre = "";
        nota = 0;
    }

    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    // Mostrar / toString
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
}
