package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        comprobarLetra(generarLetra());
    }

    public static int generarLetra() {
        double aleatorio;
        int aleatorioEntero;
        aleatorio = Math.floor((Math.random() * ((122 - 97) + 1) + 97));
        aleatorioEntero = (int) aleatorio; // Se pasa de double a entero, se omite la parte decimal.
        return aleatorioEntero;
    }

    public static int pedirLetra() {
        Scanner entrada = new Scanner(System.in);
        char letra;
        int letraAscii;
        System.out.println("Por favor, introduce una letra: ");
        letra = entrada.nextLine().charAt(0);
        letraAscii = (int) letra; // Se convierte el caracter introducido en su equivalente en codigo ASCII.
        return letraAscii;
    }

    public static void comprobarLetra(int aleatorioEntero) {
        // Se comprueba si ambos valores coinciden, si no coinciden se vuelve a pedir la letra hasta que coincidan y se cuentan los intentos.
        int intentos = 0, letraAscii;
        do {
            letraAscii = pedirLetra();
            intentos++;
            if (aleatorioEntero > letraAscii) {
                System.out.println("La letra introducida esta antes en el alfabeto");
            } else {
                System.out.println("La letra introducida esta despues en el alfabeto");
            }
        } while (aleatorioEntero != letraAscii);
        System.out.println("Has acertado, has necesitado " + intentos + " intentos");
    }
}

// Math.floor((Math.random() * ((122 - 97) + 1) + 97));    
// Math.random() devuelve un numero entre 0 y 1 sin incluir el 1. Se utiliza (122 - 97) + 1 para calcular el rango de numeros (26 letras del abecedario) 
// +1 para generar también el 122 y +97 para tomar desde 97 a 123 (sin llegar a 123), después Math.floor() redondea. 
// Math.random() * 26 + 97 Genera un numero aleatorio entre 97 y 122,? que se corresponde con el codigo ASCII para letras minúsculas

