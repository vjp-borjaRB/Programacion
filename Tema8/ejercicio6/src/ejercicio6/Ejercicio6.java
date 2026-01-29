package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado[] empleado = new Empleado[pedirLongitud(entrada)];
        crearArrayEmpleados(entrada, empleado);
        mostrarEmpleados(empleado);
    }
    
    public static int pedirLongitud(Scanner entrada) {
        int longitud;
        System.out.println("¿Cuantos empleados desea introducir?");
        longitud = entrada.nextInt();
        return longitud;
    }
    
    public static String pedirNombre(Scanner entrada) {
        String nombre;
        System.out.println("Introduzca el nombre del empleado");
        nombre = entrada.next();
        return nombre;
    }
    
    public static double pedirNhoras(Scanner entrada) {
        double nhoras;
        System.out.println("¿Cuantas horas trabajo este mes?");
        nhoras = entrada.nextDouble();
        return nhoras;
    }
    
    public static double pedirTarifa(Scanner entrada) {
        double tarifa;
        System.out.println("¿Cual es su tarifa por hora de trabajo?");
        tarifa = entrada.nextDouble();
        return tarifa;
    }
    
    public static void crearArrayEmpleados(Scanner entrada, Empleado[] empleado) {
        for (int i = 0; i < empleado.length; i++) {
            empleado[i] = new Empleado();
            empleado[i].setNombre(pedirNombre(entrada));
            empleado[i].setNhoras(pedirNhoras(entrada));
            empleado[i].setTarifa(pedirTarifa(entrada));
        }
    }
    
    public static void mostrarEmpleados(Empleado[] empleado) {
        for (Empleado i : empleado) {
            System.out.println(i.getNombre() + " trabajo " + i.getNhoras()
                    + " horas, cobra " + i.getTarifa()
                    + " euros la hora por lo que le corresponde un salario de "
                    + i.calcularSalario());
        }
    }
}
