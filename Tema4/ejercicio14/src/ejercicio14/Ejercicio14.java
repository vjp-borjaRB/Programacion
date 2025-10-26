package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
        int numero = pedirNumero(); //Pide el numero
        numero = comprobarNumero(numero); // Comprueba y actualiza el valor de numero (si es necesario)
        mostrarResultado(numero);
    }
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Por favor, introduzca un numero mayor que cero:");
        numero = entrada.nextInt();
        return numero;
    }
    
    public static int comprobarNumero(int numero) {
        while (numero <= 0) { // Si el numero introducido es menor o igual a 0 vuelve a pedir el numero
            numero = pedirNumero();
        }
        return numero;
    }
    
    public static void mostrarResultado(int numero) {
        int totalNumeros = 0;
        for (int i = 1; i <= numero; i++) { // Muestra todos los numeros multiplos de 3 y los cuenta.
            if (i % 3 == 0) {
                System.out.println(i);
                totalNumeros++;
            }
        }
        System.out.println("El total de numeros mostrados es: " + totalNumeros);
    }
}
