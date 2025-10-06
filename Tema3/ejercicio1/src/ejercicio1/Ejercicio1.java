package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Por favor introduzca un numero:");
        numero = entrada.nextInt(); //Almaceno el numero introducido por el usuario en una variable 
        //Compruebo si el numero introducido es positivo o negativo y muestro por pantalla
        if (numero < 0) {
            System.out.println(numero + " es negativo");
        } else {
            System.out.println(numero + " es positivo");
        }
    }
}
