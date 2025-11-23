package ejercicio15;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Calle del Sol", 23, "4A", "Madrid");
        Direccion direccion2 = new Direccion("Calle de la Estacion", 13, "8B", "Barcelona");
        Direccion direccion3 = new Direccion("Calle Real", 8, "3C", "Valencia");
        Empleado empleado1 = new Empleado("Alejandro", 2100, direccion1);
        Empleado empleado2 = new Empleado("Luis", 1850, direccion2);
        Empleado empleado3 = new Empleado("Juan", 1440, direccion3);
        empleado1.mostrarEmpleado();
        empleado2.mostrarEmpleado();
        empleado3.mostrarEmpleado();

    }
}
