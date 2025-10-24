package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Por favor, introduzca el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero:");
        num3 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca un cuarto numero:");
        num4 = entrada.nextInt();
        ordenarNumeros(num1, num2, num3, num4);
    }

    public static void ordenarNumeros(int num1, int num2, int num3, int num4) {
        /*Se comparan los números dos a dos y se cambia el valor de las variables utilizando una variable auxiliar 
        (el proceso se repite n-1 veces siendo n la cantidad de numeros introducidos)*/
        int aux;
        for (int i = 0; i < 3; i++) {
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
            if (num3 > num4) {
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
        System.out.println("El orden de los numeros introducidos es: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
    }
}
