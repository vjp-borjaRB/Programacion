package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        comprobarLetra(generarLetra(), pedirLetra());

    }

    public static int generarLetra() {
        double aleatorio;
        int aleatorioEntero;
        aleatorio = Math.floor((Math.random() * ((122 - 97) + 1) + 97));
        aleatorioEntero = (int) aleatorio;
        return aleatorioEntero;
    }

    public static int pedirLetra() {
        Scanner entrada = new Scanner(System.in);
        char letra;
        int letraAscii;
        System.out.println("Por favor, introduce una letra: ");
        letra = entrada.nextLine().charAt(0);
        letraAscii = (int) letra;
        return letraAscii;
    }

    public static void comprobarLetra(int aleatorioEntero, int letraAscii) {
        int intentos = 0;
        do {
            if (aleatorioEntero > letraAscii) {
                System.out.println("La letra introducida esta antes en el alfabeto");
            } else {
                System.out.println("La letra introducida esta despues en el alfabeto");
            }
            letraAscii = pedirLetra();
            intentos++;
        } while (aleatorioEntero != letraAscii);
        System.out.println("Has acertado, has necesitado " + intentos + " intentos");
    }

}
