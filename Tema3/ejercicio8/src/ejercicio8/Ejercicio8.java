package ejercicio8;

import java.util.Scanner; // Importando la clase Scanner de la librería java.util

/**
 *
 * @author BorjaRomero
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Creo el objeto entrada utilizando la clase Scanner
        int cantidad, resto, billete50, billete20, billete10, billete5, moneda2, moneda1; // Declaro las variables
        System.out.println("Por favor, indique la cantidad de dinero:");
        cantidad = entrada.nextInt(); // Recogiendo número utilizando entrada
        billete50 = cantidad / 50; // Divido cantidad entre 50 para calcular el numero de billetes y calculo el resto utilizando módulos
        resto = cantidad % 50;
        billete20 = resto / 20;
        resto = cantidad % 50 % 20;
        billete10 = resto / 10;
        resto = cantidad % 50 % 20 % 10;
        billete5 = resto / 5;
        resto = cantidad % 50 % 20 % 10 % 5;
        moneda2 = resto / 2;
        resto = cantidad % 50 % 20 % 10 % 5 % 2;
        moneda1 = resto / 1;
        System.out.print(cantidad + " euros se descomponen en ");
        if (billete50 != 0) {
            System.out.print(billete50 + " billetes de 50, ");
        }
        if (billete20 != 0) {
            System.out.print(billete20 + " billetes de 20, ");
        }
        if (billete10 != 0) {
            System.out.print(billete10 + " billetes de 10, ");
        }
        if (billete5 != 0) {
            System.out.print(billete5 + " billetes de 5, ");
        }
        if (moneda2 != 0) {
            System.out.print(moneda2 + " monedas de 2 euros, ");
        }
        if (moneda1 != 0) {
            System.out.println(moneda1 + " monedas de 1 euro.");
        }

    }
}
