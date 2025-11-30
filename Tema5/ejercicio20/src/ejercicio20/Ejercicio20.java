package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        int opcion;
        Cuenta cuenta = null;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> {
                    cuenta = crearCuenta();
                }
                case 2 -> {
                    cuenta = crearCuentaSaldo();
                }
                case 3 -> {
                    try {cuenta.ingresar(pedirCantidad());} catch (NullPointerException e) {}
                }
                case 4 -> {
                    try {cuenta.extraer(pedirCantidad());} catch (NullPointerException e) {}
                }
                case 5 -> {try {System.out.println(cuenta.getSaldo());} catch (NullPointerException e) {}
                }
                case 6 -> {
                    opcion = 6;
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

    public static Cuenta crearCuenta() {
        Cuenta cuenta = new CuentaClave(0, pedirClave());
        return cuenta;
    }

    public static Cuenta crearCuentaSaldo() {
        Cuenta cuenta = new CuentaClave(pedirCantidad(), pedirClave());
        return cuenta;
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

    public static String pedirClave() {
        String clave;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce una clave: ");
        clave = entrada.nextLine();
        return clave;
    }
}
