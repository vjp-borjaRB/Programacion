package nummayor;

/**
 *
 * @author Borja Romero
 */
public class numeroMayor {

    public static void numMayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor de los introducidos es el " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor de los introducidos es el " + num2);
        } else {
            System.out.println("El número mayor de los introducidos es el " + num3);
        }
    }

}
