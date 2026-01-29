package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int[] vector = new int[pedirLongitud()];
        rellenarAleatorios(vector);
        mostrarVector(vector);
    }

    public static void rellenarAleatorios(int[] vector) {
        int aleatorio;
        for (int i = 0; i < vector.length; i++) {
            aleatorio = (int) (Math.random() * 6) + 1;
            vector[i] = aleatorio;
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i : vector) {
            System.out.print(i + " ");
        }
    }

    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        boolean valida = false;
        do {
            System.out.println("Introduce la longitud del array: ");
            try {
                longitud = entrada.nextInt();
                if (longitud < 1 || longitud > 10) {
                    System.err.println("La longitud debe ser un entero de 1 a 10");
                } else {
                    valida = true;
                }
            } catch (InputMismatchException e) {
                System.err.println("Introduce un numero entero del 1 al 10");
                entrada.nextLine(); // Limpiar buffer 
            }
        } while (!valida);
        return longitud;
    }

}
