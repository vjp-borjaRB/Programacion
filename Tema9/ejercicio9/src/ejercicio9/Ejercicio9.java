package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario, password;
        boolean valida = false;
        do {
            System.out.println("Introduce un nombre de usuario: ");
            usuario = pedirString(entrada);
            System.out.println("Introduce un password: ");
            password = pedirString(entrada);
            if (password.length() < 6 || password.contains(usuario)) {
                valida = true;
            }
        } while (!valida);
    }

    public static String pedirString(Scanner entrada) {
        String cadena;
        entrada.nextLine();
        cadena = entrada.nextLine();
        return cadena;
    }

}
