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
        int cifra1, cifra2, cifra3, cifra4, cifra5;
        cifra1 = numero / 10000;
        vector[4] = cifra1;
        cifra2 = (numero / 1000) % 10;
        vector[3] = cifra2;
        cifra3 = (numero / 100) % 10;
        vector[2] = cifra3;
        cifra4 = (numero / 10) % 10;
        vector[1] = cifra4;
        cifra5 = numero % 10;
        vector[0] = cifra5;
    }

    public static void mostrarArray(int[] vector) {
        for (int i = 0; i < 5; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        int[] vector = new int[5];
        dividirCifras(pedirNumero(), vector);
        mostrarArray(vector);
    }

}
