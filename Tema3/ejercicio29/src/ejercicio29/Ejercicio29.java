package ejercicio29;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double aleatorio;
        int aleatorioEntero, numero, intentos = 0;
        aleatorio = Math.floor((Math.random() * 100 + 1));
        aleatorioEntero = (int) aleatorio;
        System.out.println("Introduce un numero entre 1 y 100");

        do {
            try {
                numero = entrada.nextInt();
            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.err.println("Has introducido algo distinto de un numero entero, contara como un intento " + e.getMessage());
                numero = 0;
            }
            if (numero < aleatorioEntero) {
                System.err.println("El numero es mayor");
            } else {
                System.err.println("El numero es menor");
            }
            intentos++;
        } while (numero != aleatorioEntero);
        System.out.println("Has acertado, te ha costado " + intentos + " intentos.");
    }
}
