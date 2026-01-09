package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio9 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numero = entrada.nextInt();
        return numero;
    }

    public static int calcularCifras(int numero) {
        int ncifras = 0;
        while (numero != 0) {
            numero = numero / 10;
            ncifras++;
        }
        return ncifras;
    }

    public static void rellenarArray(int numero) {
        
    }

    public static void main(String[] args) {
        int[] vector = new int[calcularCifras(pedirNumero())];

    }

}
