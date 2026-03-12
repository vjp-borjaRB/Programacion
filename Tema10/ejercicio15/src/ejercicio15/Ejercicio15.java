package ejercicio15;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        ArrayList<Empresa> listaEmpresas = new ArrayList();
        mainMenu(listaEmpresas);
    }

    public static void mainMenu(ArrayList<Empresa> listaEmpresas) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    addEmpresas(listaEmpresas);
                }
                case 2 -> {
                    Empresa.mostrarEmpresas(listaEmpresas);
                }
                case 3 -> {
                    Empresa.mostrarEmpleadosA(listaEmpresas);
                }
                case 4 -> {
                    Empresa.mostrarEmpleadosSueldo(listaEmpresas);
                }
                case 5 -> {
                }
            }
        } while (menu != 5);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Incluir empresas junto a sus empleados a la lista");
        System.out.println("2. Mostrar empresas de la lista junto a sus empleados");
        System.out.println("3. Mostrar empleados que contengan la letra 'A'");
        System.out.println("4. Mostrar empleados por sueldo");
        System.out.println("5. Salir del programa");
    }

    public static void addEmpresas(ArrayList<Empresa> listaEmpresas) {
        boolean continuarEmpresas;
        int numeroEmpresa = 0;
        do {
            Empresa nuevaEmpresa = new Empresa(); // Crear empresa
            numeroEmpresa++; // Incrementar contador para dar feedback al usuario del numero de empresa
            System.out.print("Nombre de la empresa " + numeroEmpresa + ": ");
            nuevaEmpresa.setNombreEmpresa(pedirString());
            boolean continuarEmpleados;
            int numeroEmpleado = 0;
            do { // Segundo bucle para ir creando empleados en en la misma empresa
                Empleado nuevoEmpleado = new Empleado();
                numeroEmpleado++;
                System.out.print("Nombre del empleado " + numeroEmpleado + ": ");
                nuevoEmpleado.setNombreEmpleado(pedirString());
                System.out.print("Salario del empleado " + numeroEmpleado + ": ");
                nuevoEmpleado.setSueldo(pedirInt());
                nuevaEmpresa.getEmpleados().add(nuevoEmpleado); // Añadir empleado a la lista de empleados de la empresa
                System.out.println("Desea continuar introduciendo empleados?");
                continuarEmpleados = continuar();
            } while (continuarEmpleados);
            listaEmpresas.add(nuevaEmpresa); // Añádir empresa a la lista de empresas
            System.out.println("Desea continuar introduciendo empresas?");
            continuarEmpresas = continuar();
        } while (continuarEmpresas);
    }

    public static boolean continuar() { // Bucle para pedir respuesta del usuario
        boolean valida = false;
        boolean continuar = false;
        while (!valida) {
            String respuesta = pedirString();
            if (respuesta.equalsIgnoreCase("Si")) {
                valida = true;
                continuar = true;
            } else if (respuesta.equalsIgnoreCase("No")) {
                valida = true;
                continuar = false;
            } else {
                System.err.println("Introduce una respuesta valida (Si/No)");
                valida = false;
            }
        }
        return continuar;
    }

    public static int pedirInt() {
        Scanner entradaInt = new Scanner(System.in);
        int entero;
        entero = entradaInt.nextInt();
        return entero;
    }

    public static String pedirString() {
        Scanner entradaString = new Scanner(System.in);
        String cadena;
        cadena = entradaString.nextLine();
        return cadena;

    }

}
