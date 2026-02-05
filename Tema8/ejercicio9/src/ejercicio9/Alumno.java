package ejercicio9;

import java.util.Arrays;

/**
 *
 * @author
 */
public class Alumno {

    private String nombreAlumno;
    private Asignatura[] notas;

    public Alumno() {
        nombreAlumno = "";
        notas = new Asignatura[4];
    }

    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", notas=" + Arrays.toString(notas) + '}';
    }

    // Otros métodos
    public static void rellenarNotas(Alumno[] alumno, String[] nombreAlumno, String[] nombreAsignatura) {
        for (int i = 0; i < alumno.length; i++) {
            alumno[i] = new Alumno();
            alumno[i].nombreAlumno = nombreAlumno[i];
            Asignatura[] notas = new Asignatura[nombreAsignatura.length];
            alumno[i].notas = notas;
            for (int j = 0; j < notas.length; j++) {
                float nota = (float) (Math.random() * 10);
                notas[j] = new Asignatura(nombreAsignatura[j], nota);
                alumno[i].notas = notas;
            }
        }
    }

    public static void mostrarNotas(Alumno[] alumno) {
        for (Alumno i : alumno) {
            System.out.println(i.nombreAlumno);
            for (Asignatura nota : i.notas) {
                System.out.println(nota.getNombreAsignatura());
                System.out.println(nota.getNota());
            }
        }
    }

    public static void mejorAlumno(Alumno[] alumno) {
        float maxMedia = 0;
        String mejorAlumno = "";
        for (int i = 0; i < alumno.length; i++) {
            float suma = 0;
            for (int j = 0; j < alumno[i].notas.length; j++) {
                suma += alumno[i].notas[j].getNota();
            }
            if (suma / alumno[i].notas.length > maxMedia) {
                maxMedia = suma / alumno[i].notas.length;
                mejorAlumno = alumno[i].nombreAlumno;
            }
        }
        System.out.println(mejorAlumno);
    }

    public static void masSuspensos(Alumno[] alumno) {
        int maxSuspensos = 0;
        String peorAlumno = "";
        for (int i = 0; i < alumno.length; i++) {
            int nSuspensos = 0;
            for (int j = 0; j < alumno[i].notas.length; j++) {
                if (alumno[i].notas[j].getNota() < 5) {
                    nSuspensos++;
                }
            }
            if (nSuspensos > maxSuspensos) {
                maxSuspensos = nSuspensos;
                peorAlumno = alumno[i].nombreAlumno;
            }
        }
        System.out.println(peorAlumno);
    }
}
