package ejercicio9c;

/**
 *
 * @author Borja Romero
 */
public class Persona implements Gravable {

    private String dni;
    private double ingresosAnuales;

    public Persona() {
        dni = "";
        ingresosAnuales = 0;
    }

    public Persona(String dni, double ingresosAnuales) {
        this.dni = dni;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getDni() {
        return dni;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", ingresosAnuales=" + ingresosAnuales + '}';
    }

    @Override
    public void calcularImpuesto() {
        int irpf;
        if (ingresosAnuales <= 12450) {
            irpf = 19;
        } else if (ingresosAnuales >= 12450 && ingresosAnuales <= 20200) {
            irpf = 24;
        } else if (ingresosAnuales >= 20200 && ingresosAnuales <= 35200) {
            irpf = 30;
        } else if (ingresosAnuales >= 35200 && ingresosAnuales <= 60000) {
            irpf = 37;
        } else if (ingresosAnuales >= 60000 && ingresosAnuales <= 300000) {
            irpf = 45;
        } else {
            irpf = 47;
        }
        System.out.println("El total a pagar en concepto de IRPF es:  " + ingresosAnuales * irpf / 100);

    }

}
