package ejercicio3;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Autobus[] vectorAutobuses = new Autobus[6];
    }

    public static void mainMenu(Autobus[] vectorAutobuses) {
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
            }
        } while (menu != 6);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Aparcar");
        System.out.println("2. Mostrar darsenas libres");
        System.out.println("3. Buscar autobus por matricula");
        System.out.println("4. Buscar conductor");
        System.out.println("5. Mostrar posicion del autobus con mas conductores");
    }

    public static void aparcarBus(Autobus[] vectorAutobuses) {
        boolean libre = false;
        do {
            int posicion;
            int i = 0;
            boolean encontrado = false;
            System.out.print("Introduce la posicion del Autobus: ");
            posicion = pedirInt();
            while (vectorAutobuses[i] != null && !encontrado) {
                if () {
                }
            }
        } while (!libre);
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
