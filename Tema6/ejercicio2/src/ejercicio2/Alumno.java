package ejercicio2;

/**
 *
 * @author Borja Romero
 */
public class Alumno extends Persona {

    //Atributos 
    private String grupo;

    //Constructores
    public Alumno() {
        super();
        grupo = "";
    }

    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    // Get & Set
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Almno{" + "grupo=" + grupo + '}';
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy el alumno " + getNombre() + " y estoy en el grupo " + grupo);
    }
}
