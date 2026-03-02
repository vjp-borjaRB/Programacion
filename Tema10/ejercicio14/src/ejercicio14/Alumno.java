package ejercicio14;

import java.util.Arrays;

/**
 *
 * @author Borja Romero
 */
public class Alumno {

    // Atributos
    private String nombre;
    private Asignatura[] notas;

    // Constructores
    public Alumno(String[] nombreAsignatura) {
        nombre = "";
        notas = new Asignatura[3];
        
        for (int i = 0; i< notas.length; i++) {
        new Asignatura();
        }
    }

    public Alumno(String nombre, Asignatura[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }

    // Mostrar / toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + Arrays.toString(notas) + '}';
    }

}
