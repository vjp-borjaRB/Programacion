package ejercicio19;

/**
 *
 * @author Borja Romero
 */
public class Empleado {

    // Atributos
    private String nombre;
    private int horasTrabajo;
    private int tarifa;

    // Constructores
    public Empleado() {
        nombre = "";
        horasTrabajo = 0;
        tarifa = 0;
    }

    public Empleado(String nombre, int horasTrabajo, int tarifa) {
        this.nombre = nombre;
        this.horasTrabajo = horasTrabajo;
        this.tarifa = tarifa;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajo=" + horasTrabajo + ", tarifa=" + tarifa + '}';
    }

    //Otros métodos
    public void calcularSalario() {
        double salarioTotal;
        int horasExtra;
        horasExtra = horasTrabajo - 40;
        salarioTotal = (horasExtra * tarifa * 1.5) + (40 * tarifa);
        System.out.println(salarioTotal);
    }
}
