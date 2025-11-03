package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        mostrarResultado(pedirNumero1(), pedirNumero2(0));
    }

    public static int pedirNumero1() {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        System.out.println("Introduce el primer numero: ");
        numero1 = entrada.nextInt();
        return numero1;
    }

    public static int pedirNumero2(int numero1) {
        Scanner entrada = new Scanner(System.in);
        int numero2;
        System.out.println("Introduce el segundo numero: ");
        numero2 = entrada.nextInt();
        while (numero2 <= numero1) {
            numero2 = entrada.nextInt();
        }
        return numero2;
    }

    public static void mostrarResultado(int numero1, int numero2) {
        int aux = 0, sumaTotal = 0;
        for (int i = numero1; i < numero2; i++) {
            if (i % 2 == 0) {
                sumaTotal = aux += i;
            }
        }
        System.out.println(sumaTotal);
    }
}
