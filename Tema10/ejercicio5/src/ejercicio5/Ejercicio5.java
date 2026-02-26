package ejercicio5;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaEnteros = new ArrayList();
        rellenarLista(listaEnteros, entrada);
        mostrarLista(listaEnteros);
        int mayorPar = mayorPar(listaEnteros);
        int menorImpar = menorImpar(listaEnteros);
        intercambiarPosiciones(listaEnteros, mayorPar, menorImpar);
        mostrarLista(listaEnteros);
    }

    public static int pedirEntero(Scanner entrada) {
        int numero;
        numero = entrada.nextInt();
        entrada.nextLine();
        return numero;
    }

    public static String pedirRespuesta(Scanner entrada) {
        String respuesta;
        respuesta = entrada.nextLine();
        return respuesta;
    }

    public static void rellenarLista(ArrayList<Integer> listaEnteros, Scanner entrada) {
        boolean seguir;
        do { // Pide numeros enteros hasta que el usuario responda de forma negativa.
            String respuesta;
            System.out.print("Introduce un entero: ");
            listaEnteros.add(pedirEntero(entrada));
            System.out.println("Desea seguir introduciendo numeros? Si/No");
            respuesta = pedirRespuesta(entrada);
            seguir = seguirRellenando(respuesta, entrada);
        } while (seguir);
    }

    public static boolean seguirRellenando(String respuesta, Scanner entrada) {
        respuesta = comprobarRespuesta(respuesta, entrada);
        return respuesta.equalsIgnoreCase("Si"); // Devuelve true o false en función de la respuesta.
    }

    public static String comprobarRespuesta(String respuesta, Scanner entrada) { // Pide respuesta hasta que sea Si/No (Válida)
        while (!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No")) {
            System.err.println("Introduce Si/No");
            respuesta = pedirRespuesta(entrada);
        }
        return respuesta;
    }

    public static void mostrarLista(ArrayList<Integer> listaEnteros) {
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i));
        }
    }

    public static int mayorPar(ArrayList<Integer> listaEnteros) {
        int mayorPar = Integer.MIN_VALUE;
        int numeroEntero;
        for (int i = 0; i < listaEnteros.size(); i++) {
            numeroEntero = listaEnteros.get(i);
            if (numeroEntero % 2 == 0 && numeroEntero > mayorPar) {
                mayorPar = numeroEntero;
            }
        }
        System.out.println("El mayor numero par es: " + mayorPar);
        return mayorPar;
    }

    public static int menorImpar(ArrayList<Integer> listaEnteros) {
        int menorImpar = Integer.MAX_VALUE;
        int numeroEntero;
        for (int i = 0; i < listaEnteros.size(); i++) {
            numeroEntero = listaEnteros.get(i);
            if (numeroEntero % 2 != 0 && numeroEntero < menorImpar) {
                menorImpar = numeroEntero;
            }
        }
        System.out.println("El menor numero impar es: " + menorImpar);
        return menorImpar;
    }

    public static void intercambiarPosiciones(ArrayList<Integer> listaEnteros, int mayorPar, int menorImpar) {
        int numeroEntero;
        for (int i = 0; i < listaEnteros.size(); i++) {
            numeroEntero = listaEnteros.get(i);
            if (numeroEntero == mayorPar) {
                listaEnteros.set(i, menorImpar);
            }
            if (numeroEntero == menorImpar) {
                listaEnteros.set(i, mayorPar);
            }
        }
    }
}
