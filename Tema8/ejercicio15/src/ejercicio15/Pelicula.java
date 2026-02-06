package ejercicio15;

/**
 *
 * @author Borja Romero
 */
public class Pelicula {

    private String titulo;
    private float costeLincencia;
    private Socio[] socios;

    public Pelicula() {
        titulo = "";
        costeLincencia = 0;
        socios = new Socio[4];
    }

    public Pelicula(String titulo, float costeLincencia, Socio[] socios) {
        this.titulo = titulo;
        this.costeLincencia = costeLincencia;
        this.socios = socios;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getCosteLincencia() {
        return costeLincencia;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCosteLincencia(float costeLincencia) {
        this.costeLincencia = costeLincencia;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", costeLincencia=" + costeLincencia + ", socios=" + socios + '}';
    }

}
