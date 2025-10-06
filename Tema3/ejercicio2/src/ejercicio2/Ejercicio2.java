package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Por favor introduzca un numero:");
        numero1 = entrada.nextInt(); //Almaceno el numero1 introducido por el usuario en una variable
        System.out.println("Por favor introduzca un segundo numero:");
        numero2 = entrada.nextInt(); //Almaceno el numero2 introducido por el usuario en una variable 
        //Compruebo si el primer numero introducido mayor o menor que 10 y dependiendo del valor multiplico o sumo los dos numeros
        if (numero1 > 10) {
            resultado=numero1*numero2;
            System.out.println("La operacion que ha realizado es multiplicacion y el resultado es: "+resultado);
        } else {
            resultado=numero1+numero2;
            System.out.println("La operacion que ha realizado es suma y el resultado es: "+resultado);
        }
    }
}