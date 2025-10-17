package ejercicio25;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        int sumaPares = 0, aux = 0;
        for (int i = 17; i <= 139; i++) {
            if (i % 2 == 0) {
                sumaPares = aux += i;
            }
        }
        System.out.println(sumaPares);
    }

}
