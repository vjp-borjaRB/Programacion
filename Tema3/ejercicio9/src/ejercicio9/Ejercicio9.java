package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3, numero4, aux;
        System.out.println("Por favor, introduzca el primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        numero2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero:");
        numero3 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca un cuarto numero:");
        numero4 = entrada.nextInt();
        /* Pide 4 numeros al usuario y después los ordena de menor a mayor comparando de dos en dos, 
        se repite el proceso 3 veces (n-1 veces siendo n el numero de cifras) 
        utilizo una variable auxiliar para ir cambiando el orden de los numeros.*/
        if (numero1 > numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        if (numero2 > numero3) {
            aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }
        if (numero3 > numero4) {
            aux = numero3;
            numero3 = numero4;
            numero4 = aux;
        }
        if (numero1 > numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        if (numero2 > numero3) {
            aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }
        if (numero3 > numero4) {
            aux = numero3;
            numero3 = numero4;
            numero4 = aux;
        }
        if (numero1 > numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        if (numero2 > numero3) {
            aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }
        if (numero3 > numero4) {
            aux = numero3;
            numero3 = numero4;
            numero4 = aux;
        }
        System.out.println("El orden de los numeros introducidos es el: " + numero1 + "-" + numero2 + "-" + numero3 + "-" + numero4);
    }
}
