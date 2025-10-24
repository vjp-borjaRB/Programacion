package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Por favor, introduzca el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer numero:");
        num3 = entrada.nextInt();
        numMenor.numeroMenor(num1, num2, num3);
    }

}
