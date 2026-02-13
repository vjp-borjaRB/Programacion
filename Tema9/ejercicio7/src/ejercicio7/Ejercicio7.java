package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        String[] fraseDividida;
        System.out.println("Escribe una frase: ");
        frase = entrada.nextLine();
        fraseDividida = frase.split(frase);
        for (int i = fraseDividida.length; i > 0; i--) {
            System.out.println(fraseDividida[i]);
        }
    }
}
