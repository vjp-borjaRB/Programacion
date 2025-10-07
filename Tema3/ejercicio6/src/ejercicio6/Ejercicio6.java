package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.println("Introduce la nota del alumno:");
        nota = entrada.nextInt();
        if (nota >= 0 && nota < 4) {
            System.out.println("Suspenso");
        } else if (nota > 5 && nota < 6) {
            System.out.println("Bien");
        } else if (nota > 7 && nota < 8) {
            System.out.println("Notable");
        } else if (nota > 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else if (nota < 0 || nota > 10) {
            System.err.println("Introduce una nota entre 0 y 10");
        }
    }
}
