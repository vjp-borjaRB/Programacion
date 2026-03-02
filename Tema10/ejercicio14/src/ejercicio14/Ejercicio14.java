package ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        String[] nombreAsignatura = {"Lengua", "Mates", "Fisica"};
        ArrayList<Alumno> lista = new ArrayList();
    }

    public static void mostrarOpciones() {
        System.out.println("1. Introducir un nuevo alumno junto a sus notas");
        System.out.println("2. Mostrar alumnos introducidos hasta el momento");
        System.out.println("3. Mejor alumno (media)");
        System.out.println("4. Asignatura mas dificil (numero de suspensos)");
        System.out.println("5. Salir del programa");
    }

    public static void mainMenu(ArrayList<Alumno> lista) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {

                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
            }

        } while (menu != 5);
    }

    public static void crearAlumno(ArrayList<Alumno> lista) {
        boolean finalizar = false;
        do {
            String nombre;
            System.out.println("Introduce el nombre del alumno: ");
        } while (!finalizar);
    }

    public static int pedirInt() {
        int entero;
        try (Scanner entrada = new Scanner(System.in)) {
            entero = entrada.nextInt();
        }
        return entero;
    }

    public static String pedirString() {
        String cadena;
        try (Scanner entrada = new Scanner(System.in)) {
            cadena = entrada.nextLine();
        }
        return cadena;
    }

    public static float pedirFloat() {
        float comaFlotante;
        try (Scanner entrada = new Scanner(System.in)) {
            comaFlotante = entrada.nextFloat();
        }
        return comaFlotante;
    }
}
