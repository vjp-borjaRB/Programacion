package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, sumaNum;
        System.out.println("Por favor introduce un primer numero");
        numero1 = entrada.nextInt();
        System.out.println("Por favor introduce un segundo numero");
        numero2 = entrada.nextInt();
        try {
            sumaNum = numero1 + numero2;
        } catch (InputMismatchException e) {
            System.err.println("Error: " + e.getMessage());
            sumaNum = 0;
        }
        System.out.println(sumaNum);
    }

}
