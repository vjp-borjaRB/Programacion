package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[5];
    }

    public static void mostrarMenu(Alumno[] alumnos, Scanner entrada) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirOpcion(entrada);
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

    public static int pedirOpcion(Scanner entrada) {
        int opcion;
        opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void rellenarAlumno(Scanner entrada, Alumno[] alumnos) {
    
    }

}
