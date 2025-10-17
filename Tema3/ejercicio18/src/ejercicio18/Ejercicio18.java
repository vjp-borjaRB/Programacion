package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        int intentos = 3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca su password");
        String userPassword = entrada.nextLine();
        System.out.println("Por favor, esriba su password");
        do {
            String password = entrada.nextLine();
            if (password.equals(userPassword)) {
                System.out.println("Su password es correcta");
                intentos = 0;
            } else {
                intentos--;
                System.err.println("La password introducida es incorrecta, le quedan " + intentos + " intentos.");
            }
        } while (intentos > 0);

    }

}
