package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio2 {
    
    public static void introducirDatos(int[] vector) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un numero:");
            vector[i] = entrada.nextInt();
        }
    }
    
    public static void mostrarDatos(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void modificarPosicion(int[] vector) {
        int aux = vector[2];
        vector[2] = vector[4];
        vector[4] = aux;
    }
    
    public static void main(String[] args) {
        int[] vector = new int[7];
        introducirDatos(vector);
        mostrarDatos(vector);
        modificarPosicion(vector);
        mostrarDatos(vector);
    }
    
}
