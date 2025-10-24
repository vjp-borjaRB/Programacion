package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class ClaseDistinta {

    public static int pedir1ernumero() {
        Scanner entrada = new Scanner(System.in);
        int num1;
        System.out.println("Introduce el primer numero");
        num1 = entrada.nextInt();
        return num1;
    }

    public static int pedir2onumero() {
        Scanner entrada = new Scanner(System.in);
        int num2;
        System.out.println("Introduce el segundo numero");
        num2 = entrada.nextInt();
        return num2;
    }

    public static int pedir3ernumero() {
        Scanner entrada = new Scanner(System.in);
        int num3;
        System.out.println("Introduce el tercer numero");
        num3 = entrada.nextInt();
        return num3;
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
