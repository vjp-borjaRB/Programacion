package ejercicio5;

/**
 *
 * @author Borja Romero
 */
public class Asignatura {

// Atributos 
    private String asignatura;
    private double nota;

// Constructores
    public Asignatura() {
        asignatura = "";
        nota = 0;
    }

    public Asignatura(String a, double not) {
        asignatura = a;
        nota = not;
    }

    public Asignatura(String a) {
        asignatura = a;
        nota = 0;
    }

    // Mostrar
    public void mostrarAsignaturas() {
        System.out.println(asignatura);
        System.out.println(nota);
    }

    @Override
    public String toString() {
        return "Asignatura{" + "asignatura=" + asignatura + ", nota=" + nota + '}';
    }

    // Set & Get
    public void setAsignatura(String a) {
        asignatura = a;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setNota(double n) {
        nota = n;
    }

    public double getNota() {
        return nota;
    }

    // Otros métodos
    public static double calcularNotaMedia(double n1, double n2, double n3, double n4, double n5, double n6) {
        double notaMedia;
        notaMedia = (n1 + n2 + n3 + n4 + n5 + n6) / 6;
        return notaMedia;
    }
}
