package ejercicio6;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Campania campania1 = new Campania();
        mainMenu(campania1);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Add donacion");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Mostrar donaciones por nombre de donante");
        System.out.println("4. Mostrar numero de donaciones");
        System.out.println("5. Mostrar total dinero recaudado");
        System.out.println("6. Ordenar donaciones");
        System.out.println("7. Salir del programa");
    }

    public static void mainMenu(Campania campania1) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    System.out.print("Introduce el nombre del donante:");
                    String nombre = pedirString();
                    System.out.print("Introduce la cantidad: ");
                    float cantidad = pedirFloat();
                    campania1.addDonacion(nombre, cantidad);
                }
                case 2 -> {
                    campania1.mostrarDonaciones(campania1);
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

    public static float pedirFloat() {
        Scanner entradaFloat = new Scanner(System.in);
        float comaFlotante = entradaFloat.nextFloat();
        return comaFlotante;
    }
}
