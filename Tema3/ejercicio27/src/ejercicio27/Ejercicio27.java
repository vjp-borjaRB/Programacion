package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu, numero1, numero2, sumaNum, restaNum, prodNum, divNum;
        //Entrada usuario
        System.out.println("Por favor introduce el primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("Por favor introduce el segundo numero:");
        numero2 = entrada.nextInt();
        //Mostrando el menu hasta que el usuario salga del programa (5.Salir)
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            menu = entrada.nextInt();
            switch (menu) {
                case 1 -> {
                    sumaNum = numero1 + numero2;
                    System.out.println("La suma de los numeros introducidos es: " + sumaNum);
                }
                case 2 -> {
                    restaNum = numero1 - numero2;
                    System.out.println("La resta de los numeros introducidos es: " + restaNum);
                }
                case 3 -> {
                    prodNum = numero1 * numero2;
                    System.out.println("El producto de los numeros introducidos es: " + prodNum);
                }
                case 4 -> {
                    /*Capturando excepción en caso de que el usuario asigne a numero2 el valor 0
                    en ese caso se muestra el error y se da como resultado de la operacion 0*/
                    try {
                        divNum = numero1 / numero2;
                    } catch (ArithmeticException e) {
                        System.err.println("Error: " + e.getMessage());
                        divNum = 0;
                    }
                    if (divNum != 0) {
                        System.out.println("La division de los numeros introducidos es: " + divNum);
                    }
                }
                case 5 -> {
                }
            }
        } while (menu != 5);
    }

}
