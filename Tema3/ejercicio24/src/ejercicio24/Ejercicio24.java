package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cantidadNum = 0;
        do {
            System.out.println("Por favor, introduce un numero mayor que 0");
            numero = entrada.nextInt();
            if (numero <= 0) {
                System.err.println("El numero introducido es menor o igual a 0");
            }
        } while (numero <= 0);
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                cantidadNum++;
                System.out.print(i + ",");
            }
        }
        System.out.println("\nLa cantidad de multiplos de 3 entre 0 y " + numero + " es " + cantidadNum);
    }

}
