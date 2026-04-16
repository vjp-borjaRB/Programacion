package ejercicio8;

import java.util.HashMap;

/**
 *
 * @author Borja Romero
 */
public class Ciudad {

    private String nombre;
    private HashMap<Integer, Sede> sedes;

    public Ciudad() {
        nombre = "";
        sedes = new HashMap<>();
    }

    public Ciudad(String nombre, HashMap<Integer, Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
        sedes = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<Integer, Sede> getSedes() {
        return sedes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSedes(HashMap<Integer, Sede> sedes) {
        this.sedes = sedes;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }

}
