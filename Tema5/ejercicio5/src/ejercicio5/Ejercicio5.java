package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Asignatura programacion = new Asignatura("Programacion");
        Asignatura lenguajesMarcas = new Asignatura("Lenguajes de Marcas");
        Asignatura basesDatos = new Asignatura("Bases de Datos");
        Asignatura entornosDesarrollo = new Asignatura("Entornos de Desarrollo");
        Asignatura sistemasInformaticos = new Asignatura("Sistemas Informaticos");
        Asignatura fyoLaboral = new Asignatura("Formacion y Orientacion Laboral");

        System.out.println("Por favor, introduzca la nota de Programacion: ");
        programacion.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        lenguajesMarcas.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de Bases de Datos: ");
        basesDatos.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        entornosDesarrollo.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de Sistemas Informaticos: ");
        sistemasInformaticos.setNota(entrada.nextDouble());
        System.out.println("Por ultimo, introduzca la nota de Formacion y Orientacion Laboral: ");
        fyoLaboral.setNota(entrada.nextDouble());

        System.out.println(Asignatura.calcularNotaMedia(programacion.getNota(), lenguajesMarcas.getNota(), basesDatos.getNota(), entornosDesarrollo.getNota(), sistemasInformaticos.getNota(), fyoLaboral.getNota()));

    }

}
