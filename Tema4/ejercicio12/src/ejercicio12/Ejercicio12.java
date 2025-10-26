package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        resultadoComprobacion(comprobarPassword(pedirPassword())); // Pide la contraseña --> La comprueba y repite 3 veces si no coincide --> Muestra resultado
    }

    public static int pedirPassword() {
        Scanner entrada = new Scanner(System.in);
        int password;
        System.out.println("Por favor, introduzca su password:");
        password = entrada.nextInt();
        return password;
    }

    public static boolean comprobarPassword(int password) {
        int userPassword = 1234, intentos = 1;
        boolean resultado = false;
        do {
            if (password == userPassword) { // Si las contraseñas coinciden resultado vale true e intentos vale 3 para que salga del bucle
                intentos = 3;
                resultado = true;
            } else {
                System.err.println("La password no es correcta, llevas " + intentos + " intentos");
                password = pedirPassword(); // Si no se guarda lo que devuelve pedirPassword() mantiene el valor inicial, solo se ejecuta. (return pedirPassword()((aquí no :p) o password = entrada.nextInt())
                intentos++;
                resultado = false;
            }
        } while (intentos < 3);
        return resultado;
    }

    public static void resultadoComprobacion(boolean resultado) { // Muetra por pantalla un mensaje para saber si es correcta o si se agotaron los intentos.
        if (resultado == true) {
            System.out.println("La password es correcta");
        } else {
            System.err.println("La password que ha introducido es incorreta, ha agotado los 3 intentos");
        }
    }
}
