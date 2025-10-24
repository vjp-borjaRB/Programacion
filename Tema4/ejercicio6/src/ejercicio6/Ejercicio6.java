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
        System.out.println("Introduce la nota del alumno: ");
        nota = entrada.nextInt();
        notaAlumno(nota);
    }

    public static void notaAlumno(int nota) {
        Scanner entrada = new Scanner(System.in);
        while (nota < 0 || nota > 10) {
            System.out.println("Introduce una nota entre 0 y 10:");
            nota = entrada.nextInt();
        }
        if (nota >= 0 && nota <= 4) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }

}
