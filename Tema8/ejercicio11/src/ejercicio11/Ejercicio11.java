package ejercicio11;

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

    public static void implementarSentencias(Mueble mueble1, Mueble mueble2) {
        mueble1.setDescripcion("Mesa de salon");
        mueble1.setPrecio(354.2);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3.  Mostrar muebles por precio");
        System.out.println("4. Salir del programa");
    }

    public static int pedirOpcion(Scanner entrada) {
        int opcion;
        System.out.print("Introduce una opcion: ");
        opcion = entrada.nextInt();
        return opcion;
    }

    public static void rellenarMuebles(Mueble[] vectorMuebles) {
        for (int i = 0; i < vectorMuebles.length; i++) {
            vectorMuebles[i] = new Mueble();
            vectorMuebles[i].setPrecio(Math.random() * 999);
        }
    }

    public static void mostrarMuebles(Mueble[] vectorMuebles) {
        for (int i = 0; i < vectorMuebles.length; i++) {
            System.out.println(vectorMuebles[i]);
        }
    }

    public static void filtrarPrecio(Mueble[] vectorMuebles, Scanner entrada) {
        for (int i = 0; i < vectorMuebles.length; i++) {
            if (vectorMuebles[i].getPrecio() <= pedirOpcion(entrada)) {
                System.out.println(vectorMuebles[i]);
            }
        }
    }

    public static void mostrarMenu(Mueble[] vectorMuebles, Scanner entrada) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirOpcion(entrada);
            switch (menu) {
                case 1 -> {
                    rellenarMuebles(vectorMuebles);
                }
                case 2 -> {
                    mostrarMuebles(vectorMuebles);
                }
                case 3 -> {
                    filtrarPrecio(vectorMuebles, entrada);
                }
                case 4 -> {
                }
            }
        } while (menu != 4);
    }

}
