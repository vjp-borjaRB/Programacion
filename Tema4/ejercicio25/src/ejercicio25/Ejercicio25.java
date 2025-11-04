package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        calcularResultado(pedirBase(), pedirExponente());
    }

    public static int pedirBase() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = entrada.nextInt();
        return base;
    }

    public static int pedirExponente() {
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Introduce el exponente");
        int exponente = entrada2.nextInt();
        return exponente;
    }

    public static void calcularResultado(int base, int exponente) {
        int resultado;
        while (base == 0 && exponente < 0) {
            base = pedirBase();
            exponente = pedirExponente();
        }
        resultado = (int) Math.pow(base, exponente);
        System.out.println(resultado);
    }
}
