package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer numero:");
        Numero numero1 = new Numero(entrada.nextInt());
        System.out.print("Introduce el segundo numero:");
        Numero numero2 = new Numero(entrada.nextInt());
        System.out.print("Introduce el tercer numero:");
        Numero numero3 = new Numero(entrada.nextInt());
        Numero.numeroMayor(numero1, numero2, numero3);
    }

}
