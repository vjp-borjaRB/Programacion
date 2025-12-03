package ejercicio2;

/**
 *
 * @author Borja Romero
 */
public class Profesor extends Persona {

    //Atributos 
    private String especialidad;

    //Constructores
    public Profesor() {
        super();
        especialidad = "";
    }

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    // Get & Set
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    // Mostrar

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    @Override
    public void saludar() {
        System.out.println("Hola soy el profesor "+getNombre()+" y soy de la especialidad de "+especialidad);
    }
}
