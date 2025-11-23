package ejercicio16;

/**
 *
 * @author Borja Romero
 */
public class Alumno {

    // Atributos 
    private String nombre;
    private String nota;

    // Constructores
    public Alumno() {
        nombre = "";
        nota = "";
    }

    public Alumno(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public String getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }

}
