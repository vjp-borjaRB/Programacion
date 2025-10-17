package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, sumaNum, restaNum, prodNum, divNum;
        int menu;
        System.out.println("Por favor introduce el primer numero:");
        numero1 = entrada.nextDouble();
        System.out.println("Por favor introduce el segundo numero:");
        numero2 = entrada.nextDouble();
        menu = entrada.nextInt();
        switch (menu) {
            case 1: {
                sumaNum = numero1 + numero2;
                System.out.println("La suma de los numeros introducidos es: " + sumaNum);
                break;
            }
            case 2: {
                restaNum = numero1 - numero2;
                System.out.println("La resta de los numeros introducidos es: " + restaNum);
                break;
            }
            case 3: {
                prodNum = numero1 * numero2;
                System.out.println("El producto de los numeros introducidos es: " + prodNum);
                break;
            }
            case 4: {
                divNum = numero1 / numero2;
                System.out.println("La division de los numeros introducidos es: " + divNum);
                break;
            }
            case 5: {
                break;
            }
        }
    }

}
