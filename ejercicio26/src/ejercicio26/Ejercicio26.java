package ejercicio26;

import java.util.Scanner; // Importando la clase Scanner de la librería java.util

/**
 *
 * @author BorjaRomero
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Creo el objeto entrada utilizando la clase Scanner
        int numero, cifra1, cifra2, cifra3, cifra4; // Declaro las variables 1 para el numero y 4 para cada cifra
        System.out.println("Por favor, introduce un numero de 4 cifras:");
        numero = entrada.nextInt(); // Recogiendo número utilizando entrada
        cifra1 = numero / 1000;  //Utilizo divisiones y módulos para aislar cada cifra
        System.out.println("La primera cifra es: " + cifra1);
        cifra2 = (numero / 100) % 10;
        System.out.println("La segunda cifra es: " + cifra2);
        cifra3 = (numero / 10) % 10;
        System.out.println("La tercera cifra es: " + cifra3);
        cifra4 = numero % 10;
        System.out.println("La cuarta cifra es: " + cifra4);
    }
}
