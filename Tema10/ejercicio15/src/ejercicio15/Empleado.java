package ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Empleado {

    // Atributos
    private String nombreEmpleado;
    private int sueldo;

    // Constructores
    public Empleado() {
        nombreEmpleado = "";
        sueldo = 0;
    }

    public Empleado(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    // Set & Get
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    // Mostrar / toString
    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", sueldo=" + sueldo + '}';
    }

    public static void mostrarEmpleados(ArrayList<Empleado> listaEmpleados) { // Mostrar lista de empleados
        System.out.println("---LISTA DE EMPLEADOS POR SUELDO---");
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println("EMPLEADO " + i);
            System.out.print("Nombre: " + listaEmpleados.get(i).getNombreEmpleado());
            System.out.println(" / Sueldo: " + listaEmpleados.get(i).getSueldo());
        }
    }
}
