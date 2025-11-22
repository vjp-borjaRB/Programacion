package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> {

                }

            }

        } while (opcion != 6);
    }

    public static void mostrarMenu() {
        System.out.println("1.- Crear cuenta vacía");
        System.out.println("2.- Crear cuenta con saldo inicial");
        System.out.println("3.- Ingresar dinero");
        System.out.println("4.- Sacar dinero");
        System.out.println("5.- Ver saldo");
        System.out.println("6.- Salir");
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una opcion: ");
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static float pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cantidad: ");
        float cantidad = entrada.nextFloat();
        return cantidad;
    }

}
