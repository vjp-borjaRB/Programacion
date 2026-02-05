package ejercicio9;

/**
 *
 * @author
 */
public class Asignatura {

    private String nombreAsignatura;
    private float nota;

    public Asignatura() {
        nombreAsignatura = "";
        nota = 0;
    }

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombreAsignatura=" + nombreAsignatura + ", nota=" + nota + '}';
    }

    // Otros métodos
    public static void asignaturaDificil(Alumno[] alumno, String[] nombreAsignaturas) {
        String asigDificil = "";
        float mediaMinima = 11;
        for (int i = 0; i < nombreAsignaturas.length; i++) {
            float suma = 0;
            float media = 0;
            for (int j = 0; j < alumno.length; j++) {
                suma += alumno[j].getNotas()[i].nota;
            }
            media = suma / nombreAsignaturas.length;
            if (media < mediaMinima) {
                mediaMinima = media;
                asigDificil = nombreAsignaturas[i];
            }
        }
        System.out.println(asigDificil);
    }

}
