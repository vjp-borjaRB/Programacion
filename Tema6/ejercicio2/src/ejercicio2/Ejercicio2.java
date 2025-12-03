package ejercicio2;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Sergio","DAW1");
        Profesor profesor = new Profesor("Juan","Redes");
        
        alumno.saludar();
        profesor.saludar();
        
        Persona alumno2 = new Alumno("Sergio","DAW1");
        Persona profesor2 = new Profesor("Juan","Redes");
        
        alumno2.saludar();
        profesor2.saludar();
    }
    
}
