package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la longitud del array de empleados: ");
        Empleado[] empleado = new Empleado[pedirInt(entrada)];
        rellenarArrayEmpleados(empleado, entrada);
        mostrarEmpleados(empleado);
    }

    public static void rellenarArrayEmpleados(Empleado[] empleado, Scanner entrada) {
        for (int i = 0; i < empleado.length; i++) {
            System.out.println("Introduce el nombre del empleado: ");
            String nombre = pedirString(entrada);
            System.out.println("Introduce el numero de horas trabajadas: ");
            double nhoras = pedirDouble(entrada);
            System.out.println("Introduce la tarifa para el empleado: ");
            double tarifa = pedirDouble(entrada);
            empleado[i] = new Empleado(nombre, nhoras, tarifa);
            System.out.println("---EMPLEADO " + i + " ALMACENADO CON EXITO---");
        }
    }

    public static void mostrarEmpleados(Empleado[] empleado) {
        System.out.println("---SUELDO BRUTO DE LOS EMPLEADOS---");
        for (Empleado i : empleado) {
            i.mostrarDatosEmpleado();
        }
    }

    public static int pedirInt(Scanner entrada) {
        int entero = 0;
        boolean valido = false;
        do {
            try {
                entero = entrada.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un entero");
                entrada.next();
            }
        } while (!valido);
        return entero;
    }

    public static String pedirString(Scanner entrada) {
        entrada.nextLine();
        String texto = entrada.nextLine();
        return texto;
    }

    public static double pedirDouble(Scanner entrada) {
        double doble = 0;
        boolean valido = false;
        do {
            try {
                doble = entrada.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un numero (puede contener decimales)");
                entrada.next();
            }
        } while (!valido);
        return doble;
    }
}
