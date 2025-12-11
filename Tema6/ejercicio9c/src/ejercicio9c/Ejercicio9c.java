package ejercicio9c;

/**
 *
 * @author alumno
 */
public class Ejercicio9c {

    public static void main(String[] args) {
        Vehiculo coche1 = new Vehiculo(2500, "4567F", "342245L");
        coche1.calcularImpuesto();
        Persona persona1 = new Persona("342345F", 34275);
        persona1.calcularImpuesto();
    }

}
