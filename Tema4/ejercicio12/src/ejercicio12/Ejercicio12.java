package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        resultadoComprobacion(comprobarPassword(pedirPassword()));
    }
    
    public static int pedirPassword() {
        Scanner entrada = new Scanner(System.in);
        int password;
        System.out.println("Por favor, introduzca su password: ");
        password = entrada.nextInt();
        return password;
    }
    
    public static boolean comprobarPassword(int password) {
        int userPassword = 1234, intentos = 0;
        boolean resultado = false;
        do {
            if (password == userPassword) {
                resultado = true;
            } else {
                System.out.println("La password no es correcta, prueba otra vez");
                pedirPassword();
                intentos++;
            }
        } while (intentos < 3);
        return resultado;
    }
    
    public static void resultadoComprobacion(boolean resultado) {
        System.out.println("La password es correcta");
    }
}
