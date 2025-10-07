package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero para comprobar si es par o impar: ");
        numero = entrada.nextInt();
        if (numero % 2 == 0) { // Utilizo módulo para comprobar si el resto de dividir por 2 es 0, si es 0 muestra par, si no impar.
            System.out.println("El numero introducido es par.");
        } else {
            System.out.println("El numero introducido es impar");
        }
    }
}
