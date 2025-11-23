package ejercicio19;
import java.util.Scanner;
/**
 *
 * @author Borja Romero
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("David", 40, 15);
        Empleado empleado2 = new Empleado("Jose", 50, 18);
        Empleado empleado3 = new Empleado("Fernando", 47, 13);
        empleado1.calcularSalario();
        empleado2.calcularSalario();
        empleado3.calcularSalario();
    }

}
