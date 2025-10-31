package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio18 {
    
    public static void main(String[] args) {
        mostrarNombre(pedirNombre());
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Por favor, introduce tu nombre:");
        nombre = entrada.nextLine();
        return nombre;
    }
    
    public static void mostrarNombre(String nombre) {
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre);
        }
    }
    
}
