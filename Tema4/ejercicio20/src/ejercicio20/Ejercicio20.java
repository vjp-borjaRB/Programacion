package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio20 {

    static final String SOLUCION1 = "Madrid";
    static final String SOLUCION2 = "Cristobal Colon";

    public static void main(String[] args) {

    }

    public static String respuesta() {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        respuesta = entrada.nextLine();
        return respuesta;
    }

    public static boolean primeraPregunta(String respuesta) {
        boolean resultado;
        String primeraPregunta = "¿Cual es la capital de Spain?";
        if (respuesta.equalsIgnoreCase(SOLUCION1)) {
            System.out.println("La respuesta es correcta");
        }

    }

    public static void segundaPregunta() {
        String segundaPregunta = "¿Quien descubrio America?";
    }

}
