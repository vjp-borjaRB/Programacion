package ejercicio14;

import java.util.ArrayList;
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
    public Alumno() {
        nombre = "";
        notas = new Asignatura[3];
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

    public static void mostrarAlummnos(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    // Otros métodos
    public void nombresAsignaturas(String[] nombreAsignatura) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(nombreAsignatura[i], 0);
        }
    }

    public static void mejorMedia(ArrayList<Alumno> lista) {
        float mejorMedia = 0;
        String nombreAlumno = "";
        for (int i = 0; i < lista.size(); i++) {
            float suma = 0;
            for (int j = 0; j < lista.get(i).notas.length; j++) {
                suma += lista.get(i).notas[j].getNota();
            }
            if (suma > mejorMedia) {
                mejorMedia = suma;
                nombreAlumno = lista.get(i).nombre;
            }
        }
        System.out.println("El alumno con mejor media es: " + nombreAlumno + " con " + mejorMedia / 3);
    }

    public static void asignaturaDificil(ArrayList<Alumno> lista) {
        float masDificil = Float.MAX_VALUE;
        String asignaturaDificil = "";
        for (int i = 0; i < lista.get(0).notas.length; i++) {
            float suma = 0;
            for (int j = 0; j < lista.size(); j++) {
                suma += lista.get(j).notas[i].getNota();
            }
            if (suma <= masDificil) {
                masDificil = suma / lista.size();
                asignaturaDificil = lista.get(i).notas[i].getNombre();
            }
        }
        System.out.println("La asignatura mas dificil es: " + asignaturaDificil + " con una nota media de " + masDificil);
    }
}
