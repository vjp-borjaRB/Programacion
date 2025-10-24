package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int year, month, day, bYear, bMonth, bDay, tYears, tMonths, tDays, resto;
        System.out.println("Introduce el año actual:");
        year = entrada.nextInt();
        System.out.println("Introduce el mes actual");
        month = entrada.nextInt();
        System.out.println("Introduce el dia actual");
        day = entrada.nextInt();
        System.out.println("Ahora introduce tu año de nacimiento:");
        bYear = entrada.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
        bMonth = entrada.nextInt();
        System.out.println("Introduce tu dia de nacimiento");
        bDay = entrada.nextInt();

    }

}
