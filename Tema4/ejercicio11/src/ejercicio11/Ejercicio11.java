package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        mostrarRaiz(raizCuadrada(pedirNumero())); // Mostrando la raiz de número (hay que pasarle como parámetro raizCuadrada, a su vez hay que pasarle pedirNumero)
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero para saber su raiz cuadrada");
        numero = entrada.nextInt();
        while (numero < 0) { //Pidiendo un numero al usuario, si es negativo se vuelve a pedir el numero hasta que sea 0 o positivo.
            System.err.println("Por favor, introduce un numero positivo");
            numero = entrada.nextInt();
        }
        return numero;
    }

    public static double raizCuadrada(int numero) {
        double raizNumero; // Creo una variable de tipo double para almacenar el resultado de la raíz cuadrada de numero(puede contener decimales) 
        raizNumero = (double) Math.sqrt(numero); // Conversión explícita
        return raizNumero;
    }

    public static void mostrarRaiz(double raizNumero) {
        System.out.println(raizNumero); // Método para mostrar raíz de número
    }
}
