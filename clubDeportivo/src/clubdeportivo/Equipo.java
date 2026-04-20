package clubdeportivo;

/**
 *
 * @author Borja Romero
 */
public class Equipo implements Comparable<Equipo> {

    //Atributos
    private int codigo;
    private String nombre;
    private int trofeosGanados;

    //Constructores
    public Equipo() {
        codigo = 0;
        nombre = "";
        trofeosGanados = 0;
    }

    public Equipo(int codigo, String nombre, int trofeosGanados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.trofeosGanados = trofeosGanados;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTrofeosGanados() {
        return trofeosGanados;
    }

    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTrofeosGanados(int trofeosGanados) {
        this.trofeosGanados = trofeosGanados;
    }

    //Mostrar / toString
    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", nombre=" + nombre + ", trofeosGanados=" + trofeosGanados + '}';
    }

    // CompareTo para Comparable
    @Override
    public int compareTo(Equipo o) {
        return o.trofeosGanados - this.trofeosGanados;
    }
}
