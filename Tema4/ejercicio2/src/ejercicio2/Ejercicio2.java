package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        System.out.println("Por favor, introduzca un numero:");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        num2 = entrada.nextInt();
        if (num1 > 10) {
            Producto.prod(num1, num2);
        } else {
            Suma.sum(num1, num2);
        }
    }
    
}
