package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int diasemana;
        boolean laborable = true;
        diasemana = entrada.nextInt();
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;

        }
        System.out.println(laborable);
    }

}
