package ejercicio8;

import java.util.HashMap;

/**
 *
 * @author Borja Romero
 */
public class Sede implements Comparable<Sede> {

    private String nombre;
    private float ingresosAnuales;

    public Sede() {
        nombre = "";
        ingresosAnuales = 0;
    }

    public Sede(String nombre, float ingresosAnuales) {
        this.nombre = nombre;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombre() {
        return nombre;
    }

    public float getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngresosAnuales(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresosAnuales=" + ingresosAnuales + '}';
    }

    public static void mostrarSedes(HashMap<Integer, Sede> sedes) { // Para cada sede del hashmap de sedes muestra el identificador y la sede
        sedes.forEach((id, sede) -> {
            System.out.println(id + " -> " + sede);
        });
    }

    @Override
    public int compareTo(Sede o) {
        return Float.compare(this.ingresosAnuales, o.ingresosAnuales);
    }

}
