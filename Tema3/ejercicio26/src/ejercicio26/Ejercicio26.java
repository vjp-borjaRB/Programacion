package ejercicio26;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        int sumaImpares = 0, aux = 0;
        for (int i = 111; i <= 222; i++) {
            if (i % 2 != 0) {
                sumaImpares = aux += i;
            }
        }
        System.out.println(sumaImpares);
    }

}
