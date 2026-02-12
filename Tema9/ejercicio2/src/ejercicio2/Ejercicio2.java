package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una cadena de caracteres: ");
        cadena = entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }
    
}
