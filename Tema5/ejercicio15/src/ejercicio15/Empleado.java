package ejercicio15;

/**
 *
 * @author Borja Romero
 */
public class Empleado {

    // Atributos
    private String nombre;
    private int salario;
    private Direccion direccion;

    // Constructores
    public Empleado() {
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }

    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public String getDireccion() {
        return direccion.toString();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = new Direccion();
    }

    // Mostrar
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", direccion=" + direccion + '}';
    }

    public static void mostrarDatosEmpleados(Empleado empleado) {
        System.out.println(empleado.toString());
    }

}
