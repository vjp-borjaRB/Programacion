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
        insertarAsignatura(asignatura, nombreAsignaturas);
        insertarNotas(asignatura, entrada);
        mostrarNotas(asignatura);
    }

    public static double pedirNota(Scanner entrada) {
        double nota;
        System.out.print("Introduce la nota: ");
        nota = entrada.nextDouble();
        return nota;
    }

    public static void insertarAsignatura(Asignatura[] asignatura, String[] nombreAsignaturas) {
        for (int i = 0; i < asignatura.length; i++) { // Recorre el array asignatura, crea objeto asignatura y establece el nombre
            asignatura[i] = new Asignatura();
            asignatura[i].setNombre(nombreAsignaturas[i]);
        }
    }

    public static void insertarNotas(Asignatura[] asignatura, Scanner entrada) {
        for (Asignatura i : asignatura) { // Para cada asignatura del array pide la nota
            System.out.println("Introduce la nota de " + i.getNombre());
            i.setNota(pedirNota(entrada));
        }
    }

    public static void mostrarNotas(Asignatura[] asignatura) {
        for (Asignatura i : asignatura) { // Muestra la nota de cada asignatura
            System.out.println("La nota de " + i.getNombre() + " es de: " + i.getNota());
        }
    }

}
