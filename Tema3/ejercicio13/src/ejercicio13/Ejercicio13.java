package ejercicio13;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        int numero = 12;
        while (numero > 11 && numero < 133) {
            numero++;
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

}
