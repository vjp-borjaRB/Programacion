package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 1, numero2;

        do {
            System.out.print("Por favor, introduce un numero mayor que 1: ");
            numero2 = entrada.nextInt();
        } while (numero1 >= numero2);

        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }
    }

}
