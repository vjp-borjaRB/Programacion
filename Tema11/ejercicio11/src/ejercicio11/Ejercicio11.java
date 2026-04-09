package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio11 {

    public static void main(String[] args) {

    }

    public static void mostrarOpciones() {
        System.out.println("1. Add ciudad");
        System.out.println("2. Mostrar ciudades y sedes");
        System.out.println("3. Mostrar sedes con ingresos superiores a la media");
        System.out.println("4. Buscar por nombre de sede");
        System.out.println("5. Add sede");
        System.out.println("6. Mostrar sedes por ingresos");
        System.out.println("7. Salir");
    }

    public static void mainMenu() {
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
                case 6 -> {
                }
                case 7 -> {
                }
            }
        } while (menu != 7);
    }

    public static int pedirInt() {
        Scanner entradaInt = new Scanner(System.in);
        int entero = entradaInt.nextInt();
        return entero;
    }

    public static String pedirString() {
        Scanner entradaString = new Scanner(System.in);
        String cadena = entradaString.nextLine();
        return cadena;
    }

}
