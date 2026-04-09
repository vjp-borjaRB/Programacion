package ejercicio6;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Borja Romero
 */
public class Campania {

    private String nombre;
    private HashSet<Donacion> conjunto;

    public Campania() {
        nombre = "";
        conjunto = new HashSet<>();
    }

    public Campania(String nombre, HashSet<Donacion> conjunto) {
        this.nombre = nombre;
        this.conjunto = conjunto;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Donacion> getConjunto() {
        return conjunto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConjunto(HashSet<Donacion> conjunto) {
        this.conjunto = conjunto;
    }

    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", conjunto=" + conjunto + '}';
    }

    public void addDonacion(String nombre, float cantidad) {
        Donacion donacion = new Donacion(nombre, cantidad);
        conjunto.add(donacion);
    }

    public void mostrarDonaciones() {
        for (Donacion donacion : conjunto) {
            System.out.println(donacion);
        }
    }

    public void donacionesPorNombre(String nombre) {
        for (Donacion donacion : conjunto) {
            if (donacion.getNombre().matches(nombre)) {
                System.out.println(donacion);
            }
        }
    }

    public void mostrarDonacionesTotal() {
        System.out.println("El total de donaciones es de " + conjunto.size());
    }

    public void mostrarRecaudacion() {
        float totalDonaciones = 0;
        for (Donacion donacion : conjunto) {
            totalDonaciones += donacion.getCantidad();
        }
        System.out.println("El total de donaciones es: " + totalDonaciones);
    }

    public void ordenarDonaciones(Campania campania) {
        Donacion[] donaciones = new Donacion[conjunto.size()];
        
    }
}
