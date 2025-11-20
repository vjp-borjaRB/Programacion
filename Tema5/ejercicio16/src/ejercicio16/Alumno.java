package ejercicio16;

/**
 *
 * @author Borja Romero
 */
public class Alumno {

    // Atributos 
    private String nombre;
    private double nota;

    // Constructores
    public Alumno() {
        nombre = "";
        nota = 0;
    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }

}
