package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class ClaseDistinta {

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Introduce el primer numero");
        num = entrada.nextInt();
        return num;
    }

    public static void numeroMenor(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
