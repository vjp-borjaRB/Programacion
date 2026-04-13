package ejercicio5;

/**
 *
 * @author Borja Romero
 */
public class Contacto {

    private String nombre;
    private int edad;
    private String telefono;

    public Contacto() {
        nombre = "";
        edad = 0;
        telefono = "";
    }

    public Contacto(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + '}';
    }
}
