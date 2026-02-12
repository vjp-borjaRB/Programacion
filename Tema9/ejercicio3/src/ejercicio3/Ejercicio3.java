package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        char[] cadena2;
        System.out.println("Introduce una cadena de caracteres: ");
        cadena = entrada.nextLine();
        cadena2 = cadena.toCharArray();
        for (int i = 0; i < cadena2.length; i++) {
            System.out.println(cadena2[i]);
        }

    }

}
