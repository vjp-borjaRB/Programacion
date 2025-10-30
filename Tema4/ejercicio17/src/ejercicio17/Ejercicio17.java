package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        generarLetra();

    }

    public static void generarLetra() {
        double aleatorio;
        int aleatorioEntero;
        char letra;
        aleatorio = Math.floor((Math.random() * ((122 - 97) + 1) + 97));
        aleatorioEntero = (int) aleatorio;
        letra = (char) aleatorioEntero;
        System.out.println(letra);
        
    }

    public static char pedirLetra() {
        Scanner entrada = new Scanner(System.in);
        char letra;
        System.out.println("Por favor, introduce una letra: ");
        letra = entrada.nextLine().charAt(0);
        return letra;
    }

}
