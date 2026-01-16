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
            System.out.print(vector[i]);
        }
    }
    
    public static void main(String[] args) {
        int numero = pedirNumero();
        int[] vector = new int[calcularCifras((numero))];
        dividirCifras(numero, vector);
        mostrarArray(vector);
        
    }
    
}
