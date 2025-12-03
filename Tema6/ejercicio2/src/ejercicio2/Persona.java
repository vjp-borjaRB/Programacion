package ejercicio2;

/**
 *
 * @author Borja Romero
 */
public abstract class Persona {

    //Atributos
    private String nombre;

    // Constructores
    public Persona() {
        nombre = "";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }

    //Otros métodos
    public abstract void saludar();

}
