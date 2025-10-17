package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, raizNumero;
        int error;
        do {
            System.out.println("Introduce un numero positivo:");
            numero = entrada.nextDouble();
            if (numero >= 0) {
                raizNumero = Math.sqrt(numero);
                System.out.println("La raiz cuadrada del numero introducido es: " + raizNumero);
                error = 0;
            } else {
                error = 1;
            }
        } while (error == 1);

    }

}
