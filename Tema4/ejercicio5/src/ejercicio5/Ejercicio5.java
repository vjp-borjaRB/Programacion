package ejercicio5;

import ejercicio5nuevo.parOimpar;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero para saber si es par o impar");
        numero = entrada.nextInt();
        parOimpar.parImpar(numero);
    }
    
}