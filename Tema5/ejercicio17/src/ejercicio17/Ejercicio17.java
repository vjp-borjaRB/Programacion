package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Enunciado enunciado1 = new Enunciado("En que continente se encuentra Egipto?", "Africa");
        Enunciado enunciado2 = new Enunciado("Cual es el rio mas largo del mundo?", "Nilo");
        Enunciado enunciado3 = new Enunciado("Que planeta es conocido como el planeta rojo?", "Marte");
        Enunciado enunciado4 = new Enunciado("Cual es el pais mas grande del mundo en superficie?", "Rusia");
        System.out.println("Tu nota es: " + test(enunciado1, enunciado2, enunciado3, enunciado4));
    }

    public static String entradaUsuario() {
        Scanner entrada = new Scanner(System.in);
        String entradaUsuario = entrada.nextLine();
        return entradaUsuario;
    }

    public static double test(Enunciado enunciado1, Enunciado enunciado2, Enunciado enunciado3, Enunciado enunciado4) {
        double nota = 0;
        System.out.println(enunciado1.getPregunta());
        if (enunciado1.getRespuesta().equalsIgnoreCase(entradaUsuario())) {
            nota = 2.5;
        }
        System.out.println(enunciado2.getPregunta());
        if (enunciado2.getRespuesta().equalsIgnoreCase(entradaUsuario())) {
            nota += 2.5;
        }
        System.out.println(enunciado3.getPregunta());
        if (enunciado3.getRespuesta().equalsIgnoreCase(entradaUsuario())) {
            nota += 2.5;
        }
        System.out.println(enunciado4.getPregunta());
        if (enunciado4.getRespuesta().equalsIgnoreCase(entradaUsuario())) {
            nota += 2.5;
        }
        return nota;
    }
}
