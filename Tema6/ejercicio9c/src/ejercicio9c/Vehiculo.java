package ejercicio9c;

import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Vehiculo implements Gravable {

    private int cc;
    private String matricula;
    private String dni;

    public Vehiculo() {
        cc = 0;
        matricula = "";
        dni = "";
    }

    public Vehiculo(int cc, String matricula, String dni) {
        this.cc = cc;
        this.matricula = matricula;
        this.dni = dni;
    }

    public int getCc() {
        return cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDni() {
        return dni;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "cc=" + cc + ", matricula=" + matricula + ", dni=" + dni + '}';
    }

    @Override
    public void calcularImpuesto() {
        double tarifa;
        if (cc <= 1000) {
            tarifa = 12;
        } else if (cc >= 1001 && cc <= 1499) {
            tarifa = 34;
        } else if (cc >= 1500 && cc <= 1999) {
            tarifa = 71;
        } else if (cc >= 2000 && cc <= 2999) {
            tarifa = 122;
        } else {
            tarifa = 152;
        }
        System.out.println("La tarifa es de " + tarifa);
    }

}
