package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int valor = entrada.nextInt();
        Numero numero1 = new Numero(valor); // Se crea objeto y se le pasa como parámetro el numero introducido por el usuario (valor)
        Numero.parImpar(numero1);  
    }
    
}
