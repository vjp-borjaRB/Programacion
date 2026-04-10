package ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
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
            }
        } while (menu != 5);
    }

    public static void addContactos() {
        String nombre, telefono;
        int edad;
        System.out.print("Introduce el nombre: ");
        nombre = pedirString();
        System.out.print("Introduce la edad: ");
        edad = pedirInt();
        System.out.print("Introduce el telefono: ");
        telefono = pedirString();
    }

    public static void mostrarOpciones() {
        System.out.println("1. Add contactos");
        System.out.println("2. Visualizar contactos");
        System.out.println("3. Eliminar contactos de la lista");
        System.out.println("4. Mostrar contactos por edad");
        System.out.println("5. Salir del programa");
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
