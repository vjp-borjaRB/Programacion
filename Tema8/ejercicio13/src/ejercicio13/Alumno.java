package ejercicio13;

/**
 *
 * @author Borja Romero
 */
public class Alumno {

    // Atributos
    private String nombre;
    private int edad;
    private float notaMedia;

    // Constructores
    public Alumno() {
        nombre = "";
        edad = 0;
        notaMedia = 0.00f;
    }

    public Alumno(String nombre, int edad, float notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Mostrar / toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }

    // Otros métodos
    public static void mostrarAlumnos(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno);
            }
        }
    }

    public static void alumnosPorNota(Alumno[] alumnos, float nota) {
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                if (alumno.notaMedia > nota) {
                    System.out.println(alumno);
                }
            }
        }
    }

    public static void alumnosMediaSuspensa(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                if (alumno.notaMedia < 5) {
                    System.out.println(alumno);
                }
            }
        }
    }

    public static void buscarAlumno(Alumno[] alumnos, String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                if (alumno.nombre.equalsIgnoreCase(nombre)) {
                    System.out.println(alumno.nombre + " esta matriculado");
                }
            }
        }
    }
}
