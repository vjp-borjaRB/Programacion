package ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Empresa {

    // Atributos
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    // Constructores
    public Empresa() {
        nombreEmpresa = "";
        empleados = new ArrayList();
    }

    public Empresa(String nombreEmpresa, ArrayList<Empleado> empleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = empleados;
    }

    // Set & Get
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    // Mostrar / toString
    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", empleados=" + empleados + '}';
    }

    public static void mostrarEmpresas(ArrayList<Empresa> listaEmpresas) {
        for (Empresa listaEmpresaI : listaEmpresas) {
            System.out.println(listaEmpresaI);
        }
    }

    // Otros métodos
    public static void mostrarEmpleadosA(ArrayList<Empresa> listaEmpresas) { // Mostrar empleados que tengan la letra A en su nombre
        for (int i = 0; i < listaEmpresas.size(); i++) {
            for (int j = 0; j < listaEmpresas.get(i).empleados.size(); j++) {
                Empleado empleado = listaEmpresas.get(i).empleados.get(j);
                if (empleado.getNombreEmpleado().contains("A") || empleado.getNombreEmpleado().contains("a")) {
                    System.out.println(empleado.getNombreEmpleado());
                    System.out.println(empleado.getSueldo());
                }
            }
        }
    }

    public static void mostrarEmpleadosSueldo(ArrayList<Empresa> listaEmpresas) {
        ArrayList<Empleado> listaEmpleados = new ArrayList();
        for (int i = 0; i < listaEmpresas.size(); i++) { // Volcar empleados a una lista auxiliar
            for (int j = 0; j < listaEmpresas.get(i).getEmpleados().size(); j++) {
                listaEmpleados.add(listaEmpresas.get(i).getEmpleados().get(j));
            }
        }
        for (int i = 0; i < listaEmpleados.size(); i++) { // Recorrer la lista de empleados y comparar 2 a 2 ordenando por sueldo
            for (int j = i + 1; j < listaEmpleados.size(); j++) {
                if (listaEmpleados.get(i).getSueldo() < listaEmpleados.get(j).getSueldo()) {
                    Empleado aux = listaEmpleados.get(i);
                    listaEmpleados.set(i, listaEmpleados.get(j));
                    listaEmpleados.set(j, aux);
                }
            }
        }
        Empleado.mostrarEmpleados(listaEmpleados); // Mostrar la lista de empleados
    }
}
