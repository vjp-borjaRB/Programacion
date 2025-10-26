package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        mostrarResultado(pedirNumero());
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero mayor que 1");
        numero = entrada.nextInt();
        while (!mayorUno(numero)) {
            System.err.println("Por favor, introduce un numero mayor que 1");
            numero = pedirNumero();
        }
        return numero;
    }

    public static boolean mayorUno(int numero) {
        boolean mayorUno = false;
        if (numero > 1) {
            mayorUno = true;
        }
        return mayorUno;
    }

    public static void mostrarResultado(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + "-");
        }
    }
}
