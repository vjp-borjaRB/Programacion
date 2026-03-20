package ejercicio6;

import java.util.HashSet;

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

    public void mostrarDonaciones(Campania campania) {
        for (int i = 0; i < conjunto.size(); i++) {
            System.out.println(conjunto);
        }
    }
    
    public void donacionesPorNombre(String nombre) {
        for (int i = 0; i < conjunto.size(); i++) {
            if (conjunto.)
        }
    }
}
