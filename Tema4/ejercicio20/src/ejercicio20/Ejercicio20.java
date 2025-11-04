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
        resultado(primeraPregunta(), segundaPregunta()); // Muestra por pantalla una calificacion dependiendo de el numero de respuestas correctas.
    }

    public static String respuesta() {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        respuesta = entrada.nextLine();
        return respuesta;
    }

    public static boolean primeraPregunta() {
        String respuesta;
        boolean resultado1 = false;
        String primeraPregunta = "¿Cual es la capital de Spain?";
        System.out.println(primeraPregunta);
        respuesta = respuesta();
        if (respuesta.equalsIgnoreCase(SOLUCION1)) { // Compara la respuesta introducida por el usuario con la solucion almacenada en la constante (tipo String), no distingue entre mayúsculas y minúsculas.
            System.out.println("La respuesta es correcta");
            resultado1 = true;
        } else {
            System.err.println("La respuesta es incorrecta");
        }
        return resultado1;
    }

    public static boolean segundaPregunta() {
        String respuesta;
        boolean resultado2 = false;
        String segundaPregunta = "¿Quien descubrio America?";
        System.out.println(segundaPregunta);
        respuesta = respuesta();
        if (respuesta.equalsIgnoreCase(SOLUCION2)) {
            System.out.println("La respuesta es correcta");
            resultado2 = true;
        } else {
            System.err.println("La respuesta es incorrecta");
        }
        return resultado2;
    }

    public static void resultado(boolean resultado1, boolean resultado2) {
        if (resultado1 && resultado2) { // Si el usuario responde correctamente a las dos preguntas muestra 10, si acierta una y falla otra 5, si falla las 2 muestra 0. 
            System.out.println("10");
        } else if (resultado1 != resultado2) {
            System.out.println("5");
        } else {
            System.out.println("0");
        }

    }

}
