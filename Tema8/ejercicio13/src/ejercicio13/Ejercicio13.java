package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];
        mostrarMenu(alumnos);
    }

    public static void mostrarMenu(Alumno[] alumnos) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    rellenarAlumno(alumnos);
                }
                case 2 -> {
                    Alumno.mostrarAlumnos(alumnos);
                }
                case 3 -> {
                    float nota = pedirMedia();
                    Alumno.alumnosPorNota(alumnos, nota);
                }
                case 4 -> {
                    Alumno.alumnosMediaSuspensa(alumnos);
                }
                case 5 -> {
                    String nombre = pedirNombre();
                    Alumno.buscarAlumno(alumnos, nombre);
                }
                case 6 -> {
                }
            }
        } while (menu != 6);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Rellenar un alumno");
        System.out.println("2. Mostrar vector alumnos");
        System.out.println("3. Mostrar alumnos con mejor nota media");
        System.out.println("4. Mostrar alumnos con nota media suspensa");
        System.out.println("5. Buscar alumnos");
        System.out.println("6. Salir del programa");
    }

    public static int pedirInt() {
        Scanner entrada = new Scanner(System.in);
        int entero;
        entero = entrada.nextInt();
        return entero;
    }

    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("Introduce la edad del alumno: ");
        edad = entrada.nextInt();
        return edad;
    }

    public static float pedirMedia() {
        Scanner entrada = new Scanner(System.in);
        float notaMedia;
        System.out.print("Introduce la nota media del alumno: ");
        notaMedia = entrada.nextFloat();
        return notaMedia;
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce el nombre del alumno: ");
        nombre = entrada.nextLine();
        return nombre;
    }

    public static void rellenarAlumno(Alumno[] alumnos) {
        boolean libre = false;
        do {
            System.out.println("Introduce la posicion para el alumno: ");
            int posicion = pedirInt();
            if (alumnos[posicion] == null) {
                libre = true;
                alumnos[posicion] = new Alumno(pedirNombre(), pedirEdad(), pedirMedia());
            } else {
                System.err.println("Ya existe un alumno en esa posicion");
            }
        } while (!libre);
    }
}
