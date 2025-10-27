package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        int numero = pedirNumero();
        int numero2 = pedirNumero2();
        menu(numero, numero2);
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero;");
        numero = entrada.nextInt();
        return numero;
    }

    public static int pedirNumero2() {
        Scanner entrada = new Scanner(System.in);
        int numero2;
        System.out.println("Introduce otro numero;");
        numero2 = entrada.nextInt();
        return numero2;
    }

    public static int seleccionarOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Selecciona una opcion");
        opcion = entrada.nextInt();
        return opcion;
    }

    public static void mostrarMenu() {
        System.out.println("1.- Sumar los numeros.");
        System.out.println("2.- Restar los numeros.");
        System.out.println("3.- Multiplicar los numeros.");
        System.out.println("4.- Dividir los numeros.");
        System.out.println("5.- Salir del programa.");

    }

    public static void menu(int numero, int numero2) {
        int opcion;
        do {
            mostrarMenu();
            opcion = seleccionarOpcion();
            switch (opcion) {
                case 1 ->
                    sumarNumeros(numero, numero2);
                case 2 ->
                    restarNumeros(numero, numero2);
                case 3 ->
                    multiplicarNumeros(numero, numero2);
                case 4 ->
                    dividirNumeros(numero, numero2);
                case 5 ->
                    salirMenu(opcion);
            }
        } while (opcion != 5);
    }

    public static void sumarNumeros(int numero, int numero2) {
        int resultado;
        resultado = numero + numero2;
        System.out.println(resultado);
    }

    public static void restarNumeros(int numero, int numero2) {
        int resultado;
        resultado = numero - numero2;
        System.out.println(resultado);
    }

    public static void multiplicarNumeros(int numero, int numero2) {
        int resultado;
        resultado = numero * numero2;
        System.out.println(resultado);
    }

    public static void dividirNumeros(int numero, int numero2) {
        int resultado;
        resultado = numero / numero2;
        System.out.println(resultado);
    }

    public static void salirMenu(int opcion) {
        opcion = 5;
    }

}
