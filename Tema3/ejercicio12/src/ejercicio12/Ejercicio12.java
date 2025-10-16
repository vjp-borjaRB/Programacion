package ejercicio12;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        int numero = 11;
        do {
            numero++;
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        } while (numero > 11 && numero < 133);
    }
}
