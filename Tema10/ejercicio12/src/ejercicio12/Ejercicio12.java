package ejercicio12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList();
        pedirNombres(listaNombres);
        mostrarNombres(listaNombres);
    }

    public static void pedirNombres(ArrayList<String> listaNombres) {
        boolean continuar;
        do {
            System.out.println("Introduce un nombre: ");
            String nombre = pedirString();
            listaNombres.add(nombre);
            System.out.println("Desea seguir introduciendo nombres?");
            continuar = continuar();
        } while (continuar);
    }

    public static boolean continuar() {
        String respuesta;
        boolean continuar = false;
        boolean valida;
        do {
            respuesta = pedirString();
            if (respuesta.toLowerCase().equals("si")) {
                continuar = true;
                valida = true;
            } else if (respuesta.toLowerCase().equals("no")) {
                continuar = false;
                valida = true;
            } else {
                valida = false;
                System.err.println("Introduce una respuesta valida");
            }

        } while (!valida);
        return continuar;
    }

    public static void mostrarNombres(ArrayList<String> listaNombres) {
        Iterator<String> iterador = listaNombres.iterator();
        while (iterador.hasNext()) {
            String aux = iterador.next();
            System.out.println(aux);
        }
    }

    public static String pedirString() {
        Scanner entradaString = new Scanner(System.in);
        String cadena = entradaString.nextLine();
        return cadena;
    }

}
