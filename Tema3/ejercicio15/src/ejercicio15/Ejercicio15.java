package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, multiplicador;
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar:");
        numero = entrada.nextInt();
        for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(numero + "x" + multiplicador + "=" + multiplicador * numero);
        }
    }

}
