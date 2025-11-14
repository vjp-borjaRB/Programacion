package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        System.out.print("Introduce el primer numero: ");
        numero1.setValor(pedirNumero());
        System.out.print("Introduce el segundo numero: ");
        numero2.setValor(pedirNumero());
        if (mayor10(numero1.getValor())) {
            multiplicarNumeros(numero1.getValor(), numero2.getValor());
        } else {
            sumarNumeros(numero1.getValor(), numero2.getValor());
        }
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        return numero;
    }

    public static boolean mayor10(int numero1) {
        boolean mayor10 = false;
        if (numero1 > 10) {
            mayor10 = true;
        }
        return mayor10;
    }

    public static void sumarNumeros(int numero1, int numero2) {
        int resultado;
        resultado = numero1 + numero2;
        System.out.println(numero1 + "+" + numero2 + "=" + resultado);
    }

    public static void multiplicarNumeros(int numero1, int numero2) {
        int resultado;
        resultado = numero1 * numero2;
        System.out.println(numero1 + "*" + numero2 + "=" + resultado);
    }
}
