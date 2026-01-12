package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio8 {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero de 5 cifras: ");
        int numero = entrada.nextInt();
        return numero;
    }

    public static void dividirCifras(int numero, int[] vector) {
        int cifra;
        for (int i = 0; i < vector.length; i++) {
            cifra = numero % 10;
            numero /= 10;
            vector[i] = cifra;
        }
    }

    public static void mostrarArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        int[] vector = new int[5];
        dividirCifras(pedirNumero(), vector);
        mostrarArray(vector);
    }

}
