package ejercicio15;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Calle numero1", 2, "4A", "Madrid");
        Direccion direccion2 = new Direccion("Calle numero2", 4, "8B", "Barcelona");
        Direccion direccion3 = new Direccion("Calle numero3", 6, "3C", "Valencia");
        Empleado empleado1 = new Empleado("Alejandro", 1800, direccion1);
        Empleado empleado2 = new Empleado("Luis", 1950, direccion2);
        Empleado empleado3 = new Empleado("Juan", 2300, direccion3);
        Empleado.mostrarDatosEmpleados(empleado1);
        Empleado.mostrarDatosEmpleados(empleado2);
        Empleado.mostrarDatosEmpleados(empleado3);
    }
}
