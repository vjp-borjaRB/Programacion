package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        return nombre;
    }

    public static double pedirNota() {
        Scanner entrada = new Scanner(System.in);
        double nota = entrada.nextDouble();
        return nota;
    }
    
    public static boolean comprobarNota(double nota) {
    
    }

        
}
