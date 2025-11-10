package ejercicio2;

/**
 *
 * @author Borja Romero
 */
public class Test {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.establecerNombreyHoras("DAM", 2000);
        curso2.establecerNombreyHoras("DAW", 2000);

        System.out.println(curso1.obtenerHoras());
        System.out.println(curso1.obtenerNombre());
        System.out.println(curso2.obtenerHoras());
        System.out.println(curso2.obtenerNombre());
        System.out.println(Curso.verNumeroCursos());

    }
}
