package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio1 {

    public static void pedirNumeros(int[] vector) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un numero: ");
            vector[i] = entrada.nextInt();
        }
    }

    public static void mostrarPares(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println(vector[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] vector = new int[10];
        pedirNumeros(vector);
        mostrarPares(vector);
    }

}
