package ejercicio6;

/**
 *
 * @author Borja Romero
 */
public class Empleado {

    //Atributos
    private String nombre;
    private double nhoras;
    private double tarifa;

    //Constructores
    public Empleado() {
        nombre = "";
        nhoras = 0;
        tarifa = 0;
    }

    public Empleado(String nombre, double nhoras, double tarifa) {
        this.nombre = nombre;
        this.nhoras = nhoras;
        this.tarifa = tarifa;
    }

    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public double getNhoras() {
        return nhoras;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNhoras(double nhoras) {
        this.nhoras = nhoras;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    // Mostrar / toString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", nhoras=" + nhoras + ", tarifa=" + tarifa + '}';
    }

    // Otros métodos
    public double calcularSalario() {
        double salario;
        salario = nhoras * tarifa;
        return salario;
    }
}
