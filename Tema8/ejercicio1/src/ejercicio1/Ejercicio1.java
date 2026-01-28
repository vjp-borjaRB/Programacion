package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Asignatura[] asignatura = new Asignatura[6];
        String[] nombreAsignaturas = {"Programacion", "Lenguaje de Marcas",
            "Bases de Datos", "Entornos de Desarrollo", "Sistemas Informaticos",
            "Formacion y Orientacion Laboral"};
        insertarAsignatura(nombreAsignaturas, asignatura);
        insertarNotas(asignatura, entrada);
        mostrarNotas(asignatura);
    }

    public static double pedirNota(Scanner entrada) {
        double nota;
        System.out.print("Introduce la nota: ");
        nota = entrada.nextDouble();
        return nota;
    }

    public static void insertarAsignatura(String[] nombreAsignaturas, Asignatura[] asignatura) {
        for (int i = 0; i < asignatura.length; i++) {
            asignatura[i] = new Asignatura();
            asignatura[i].setNombre(nombreAsignaturas[i]);
        }
    }

    public static void insertarNotas(Asignatura[] asignatura, Scanner entrada) {
        for (Asignatura asignatura1 : asignatura) {
            System.out.println("Introduce la nota de " + asignatura1.getNombre());
            asignatura1.setNota(pedirNota(entrada));
        }
    }

    public static void mostrarNotas(Asignatura[] asignatura) {
        for (Asignatura asignatura1 : asignatura) {
            System.out.println("La nota de " + asignatura1.getNombre() + " es de: " + asignatura1.getNota());
        }
    }

}
