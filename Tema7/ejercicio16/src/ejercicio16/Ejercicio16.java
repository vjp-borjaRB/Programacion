package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] alumno = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignatura = {"Lengua", "Mates", "Historia", "Fisica"};
    }

    public static void mostrarMenu() {
        int menu = 0;
        do {
            imprimirMenu();
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
        } while (menu != 5);
    }

    public static int pedirOpcion(Scanner entrada) {
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void imprimirMenu() {
        System.out.println("1. Rellenar las notas de los alumnos.");
        System.out.println("2. Mostrar notas alumnos.");
        System.out.println("3. Mejor alumno de la clase.");
        System.out.println("4. Alumno con mas suspensos.");
        System.out.println("5. Asignatura mas dificil.");
        System.out.println("6. Salir del programa.");
    }

}
