package ejercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Mueble[] vectorMuebles = new Mueble[4];
        mostrarMenu(vectorMuebles, entrada);
    }

    public static void mostrarMenu(Mueble[] vectorMuebles, Scanner entrada) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt(entrada);
            switch (menu) {
                case 1 -> {
                    rellenarMuebles(vectorMuebles, entrada);
                }
                case 2 -> {
                    mostrarMuebles(vectorMuebles);
                }
                case 3 -> {
                    filtrarMueblesPrecio(vectorMuebles, entrada);
                }
                case 4 -> {
                }
            }
        } while (menu != 4);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3. Mostrar muebles por precio");
        System.out.println("4. Salir del programa");
    }

    public static void rellenarMuebles(Mueble[] vectorMuebles, Scanner entrada) {
        double precio;
        String descripcion;
        for (int i = 0; i < vectorMuebles.length; i++) {
            System.out.println("--- MUEBLE " + i + " ---");
            System.out.println("Introduce el precio: ");
            precio = pedirDouble(entrada);
            System.out.println("Introduce la descripcion del producto: ");
            descripcion = pedirString(entrada);
            vectorMuebles[i] = new Mueble(precio, descripcion);
        }
    }

    public static void mostrarMuebles(Mueble[] vectorMuebles) {
        for (Mueble mueble : vectorMuebles) {
            System.out.println(mueble);
        }
    }

    public static void filtrarMueblesPrecio(Mueble[] vectorMuebles, Scanner entrada) {
        double precio;
        System.out.println("Introduce un precio: ");
        precio = pedirDouble(entrada);
        for (Mueble mueble : vectorMuebles) {
            if (precio >= mueble.getPrecio()) {
                System.out.println(mueble);
            }
        }
    }

    public static int pedirInt(Scanner entrada) {
        int entero = 0;
        boolean valido = false;
        do {
            try {
                entero = entrada.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un entero");
                entrada.next();
            }
        } while (!valido);
        return entero;
    }

    public static double pedirDouble(Scanner entrada) {
        double doble = 0;
        boolean valido = false;
        do {
            try {
                doble = entrada.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un numero (puede contener decimales)");
                entrada.next();
            }
        } while (!valido);
        return doble;
    }

    public static String pedirString(Scanner entrada) {
        String texto;
        entrada.nextLine();
        texto = entrada.nextLine();
        return texto;
    }
}
