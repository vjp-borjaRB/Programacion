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
        boolean valida;
        do {
            valida = true;
            int contadorNumeros = 0;
            System.out.println("Introduce un nombre de usuario: ");
            usuario = pedirString(entrada);
            System.out.println("Introduce un password: ");
            password = pedirString(entrada);
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    contadorNumeros++;
                }
            }
            if (password.length() < 6 || password.contains(usuario) || contadorNumeros < 2) {
                valida = false;
            }
        } while (!valida);
    }

    public static String pedirString(Scanner entrada) {
        String cadena;
        cadena = entrada.nextLine();
        return cadena;
    }

}
