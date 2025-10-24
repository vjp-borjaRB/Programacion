package ejercicio4;

/**
 *
 * @author borr13
 */
public class numMenor {

    public static void numeroMenor(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            System.out.println("El numero menor de los introducidos es el " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("El numero menor de los introducidos es el " + num2);
        } else {
            System.out.println("El numero menor de los introducidos es el " + num3);
        }
    }
}
