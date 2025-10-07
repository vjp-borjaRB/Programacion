package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("Por favor, introduzca el primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        numero2 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca un tercer numero:");
        numero3 = entrada.nextInt();
        if (numero1 < numero2 && numero1 < numero3) {
            /* Si numero1 es menor que numero2 y numero3 muestra numero1, 
            si numero2 es menor que numero1 y numero3 muestro numero2, si no muestra numero3. */
            System.out.println("El numero menor de los introducidos es el " + numero1);
        } else if (numero2 < numero3 && numero2 < numero1) {
            System.out.println("El numero menor de los introducidos es el " + numero2);
        } else {
            System.out.println("El numero menor de los introducidos es el " + numero3);
        }
    }
}
