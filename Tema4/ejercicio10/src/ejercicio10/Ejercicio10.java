package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        tablaMultiplicar(pedirNumero());
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero para saber su tabla de multiplicar");
        numero = entrada.nextInt();
        return numero;
    }

    public static void tablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + numero * i);
        }
    }

}
