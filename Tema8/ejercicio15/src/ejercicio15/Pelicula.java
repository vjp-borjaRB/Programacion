package ejercicio15;

import java.util.Arrays;

/**
 *
 * @author
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
        return "Pelicula{" + "titulo=" + titulo + ", costeLincencia=" + costeLincencia + ", socios=" + Arrays.toString(socios) + '}';
    }

    public static void mostrarPeliculas(Pelicula[] peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public static void rellenarPeliculasSocios(Pelicula[] peliculas, String[] nombrePeliculas, String[] nombreSocios) {
        for (int i = 0; i < peliculas.length; i++) {
            int random = (int) (Math.random() * (200 - 80 + 1)) + 80;
            peliculas[i] = new Pelicula();
            peliculas[i].titulo = nombrePeliculas[i];
            peliculas[i].costeLincencia = random;
            Socio[] socios = new Socio[nombreSocios.length];
            peliculas[i].socios = socios;
            for (int j = 0; j < peliculas[i].socios.length; j++) {
                int socioAleatorio = (int) (Math.random() * nombreSocios.length);
                float abonoAleatorio = (float) Math.random() * (100 - 20) + 20;
                peliculas[i].socios[j] = new Socio(nombreSocios[socioAleatorio], abonoAleatorio);
            }
        }
    }

    public static void masRentable(Pelicula[] peliculas) {
        String masRentable = "";
        float totalMasRentable = -100;
        float beneficioNeto;
        for (int i = 0; i < peliculas.length; i++) {
            float suma = 0;
            for (int j = 0; j < peliculas[i].socios.length; j++) {
                suma += peliculas[i].socios[j].getPrecioAbonado();
            }
            beneficioNeto = suma - peliculas[i].costeLincencia;
            if (beneficioNeto > totalMasRentable) {
                totalMasRentable = beneficioNeto;
                masRentable = peliculas[i].titulo;
            }
        }
        System.out.println(masRentable);
    }
}
