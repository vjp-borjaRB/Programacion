package ejercicio3;

import java.util.Scanner;
import nummayor.NumeroMayor;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Por favor, introduzca el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        num2 = entrada.nextInt();
        System.out.println("Por último, introduzca un tercer numero:");
        num3 = entrada.nextInt();
        NumeroMayor.numMayor(num1, num2, num3);
    }
    
}
