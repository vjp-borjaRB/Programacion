package ejercicio16;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList();
    }

    public static void mostrarOpcionesPrincipal() {
        System.out.println("1. MENU ADMINISTRACION");
        System.out.println("2. MENU DE COMPRA");
        System.out.println("3. SALIR");
    }

    public static void mostrarOpcionesAdmin() {
        System.out.println("1. Introducir productos en la lista");
        System.out.println("2. Visualizar la lista de productos");
        System.out.println("3. Eliminar productos de la lista");
        System.out.println("4. Volver al menu principal");
    }

    public static void mostrarOpcionesCompra() {
        System.out.println("1. Comprar productos");
        System.out.println("2. Volver al menu principal");
    }

    public static void mainMenu() {
        int menu;
        do {
            mostrarOpcionesPrincipal();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
            }
        } while (menu != 3);
    }

    public static int pedirInt() {
        Scanner entradaInt = new Scanner(System.in);
        int entero = entradaInt.nextInt();
        return entero;
    }

}
