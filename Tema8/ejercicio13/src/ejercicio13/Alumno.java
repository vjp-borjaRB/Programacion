package ejercicio13;

/**
 *
 * @author Borja Romero
 */
public class Alumno {

    // Atributos
    private String nombre;
    private int edad;
    private float notaMedia;

    // Constructores
    public Alumno() {
        nombre = "";
        edad = 0;
        notaMedia = 0;
    }

    public Alumno(String nombre, int edad, float notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Mostrar / toString

    @Override
    public String toString() {
        return nombre + " edad -> " + edad + " notaMedia -> " + notaMedia;
    }

}
