package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Triangulo triangulo1 = new Triangulo();
        System.out.print("Introduce la longitud del primer cateto: ");
        triangulo1.setCateto1(entrada.nextDouble());
        System.out.print("Introduce la longitud del segundo cateto: ");
        triangulo1.setCateto2(entrada.nextDouble());
        triangulo1.calcularHipotenusa();
    }
}
