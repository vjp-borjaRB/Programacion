package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Introduce un dividendo:");
        numero1 = entrada.nextInt();
        System.out.println("Introduce un divisor:");
        numero2 = entrada.nextInt();
        try {
            resultado = numero1 / numero2;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            resultado = 0;
        }
        System.err.println(resultado);
    }

}
