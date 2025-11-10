package ejercicio2;

/**
 *
 * @author Borja Romero
 */
public class Curso {

    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos;

    public void establecerNombreyHoras(String nom, int numHoras) {
        nombre = nom;
        numeroHoras = numHoras;
        sumarCursos();
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerHoras() {
        return numeroHoras;
    }

    public static void sumarCursos() {
        numeroDeCursos++;
    }

    public static int verNumeroCursos() {
        return numeroDeCursos;
    }

}
