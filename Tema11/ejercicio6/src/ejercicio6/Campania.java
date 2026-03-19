package ejercicio6;

import java.util.TreeSet;

/**
 *
 * @author Borja Romero
 */
public class Campania implements Comparable<Donacion> {

    private String nombre;
    private TreeSet<Donacion> conjunto;

    public Campania() {
        nombre = "";
        conjunto = new TreeSet<>();
    }

    public Campania(String nombre, TreeSet<Donacion> conjunto) {
        this.nombre = nombre;
        this.conjunto = conjunto;
    }

    public String getNombre() {
        return nombre;
    }

    public TreeSet<Donacion> getConjunto() {
        return conjunto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConjunto(TreeSet<Donacion> conjunto) {
        this.conjunto = conjunto;
    }

    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", conjunto=" + conjunto + '}';
    }

    @Override
    public int compareTo(Donacion o) {
        
    }
}
