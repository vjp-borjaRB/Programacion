package ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> lista;
        lista = new ArrayList();
        rellenarLista(entrada, lista);
        mostarLista(lista);
    }
    
    public static String pedirString(Scanner entrada) {
        String cadena;
        cadena = entrada.nextLine();
        return cadena;
    }
    
    public static void rellenarLista(Scanner entrada, ArrayList<String> lista) {
        boolean continuar = false;
        String respuesta;
        do {
            System.out.println("Introduce un nombre: ");
            lista.add(pedirString(entrada));
            System.out.println("Desea introducir otro nombre?");
            respuesta = pedirString(entrada);
            if (respuesta.equalsIgnoreCase("Si")) {
                continuar = true;
            } else if (respuesta.equalsIgnoreCase("No")) {
                continuar = false;
            } else {
                System.err.println("Introduce una respuesta valida (Si/No)");
            }
        } while (continuar);
    }
    
    public static void mostarLista(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
