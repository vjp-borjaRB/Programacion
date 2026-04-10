package ejercicio7;

import java.util.HashSet;

/**
 *
 * @author Borja Romero
 */
public class Campania implements Comparable<Campania> {

    private String nombre;
    private HashSet<Donacion> donaciones;

    public Campania() {
        nombre = "";
        donaciones = new HashSet();
    }

    public Campania(String nombre, HashSet<Donacion> donaciones) {
        this.nombre = nombre;
        this.donaciones = donaciones;
    }

    public Campania(String nombre) {
        this.nombre = nombre;
        donaciones = new HashSet();
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDonaciones(HashSet<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", donaciones=" + donaciones + '}';
    }

    public static void mostrarCampaniasDonaciones(HashSet<Campania> campanias) {
        for (Campania c : campanias) {
            System.out.println("CAMPANIA " + c.nombre);
            Donacion.mostrarDonaciones(c.donaciones);
        }
    }

    @Override
    public int compareTo(Campania o) { // Comparable
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

}
