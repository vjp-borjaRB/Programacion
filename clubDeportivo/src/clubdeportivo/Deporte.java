package clubdeportivo;

import java.util.HashSet;

/**
 *
 * @author Borja Romero
 */
public class Deporte {

    //Atributos
    private String nombre;
    private HashSet<Equipo> equipos;

    //Constructores
    public Deporte() {
        nombre = "";
        equipos = new HashSet<>();
    }

    public Deporte(String nombre, HashSet<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }

    public Deporte(String nombre) {
        this.nombre = nombre;
        equipos = new HashSet<>();
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public HashSet<Equipo> getEquipos() {
        return equipos;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipos(HashSet<Equipo> equipos) {
        this.equipos = equipos;
    }

    // Mostrar / toString
    @Override
    public String toString() {
        return "Deporte{" + "nombre=" + nombre + ", equipos=" + equipos + '}';
    }

    public void mostrarEquipos() {
        for (Equipo equipoI : equipos) {
            System.out.println(equipoI);
        }
    }

    public boolean buscarEquipo(String nombre) { // Devuelve un booleano, true o false dependiendo de si el nombre del equipo se encuentra en el HashSet
        boolean encontrado = false;
        for (Equipo equipoI : equipos) {
            encontrado = equipoI.getNombre().equalsIgnoreCase(nombre);
        }
        return encontrado;
    }

}
