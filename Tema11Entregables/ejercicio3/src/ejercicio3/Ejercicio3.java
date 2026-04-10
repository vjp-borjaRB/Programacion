package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Autobus[] vectorAutobuses = new Autobus[6];
        mainMenu(vectorAutobuses);
    }

    public static void mainMenu(Autobus[] vectorAutobuses) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    aparcarBus(vectorAutobuses);
                }
                case 2 -> {
                    mostrarDarsenasLibres(vectorAutobuses);
                }
                case 3 -> {
                    buscarMatricula(vectorAutobuses);
                }
                case 4 -> {
                    buscarConductor(vectorAutobuses);
                }
                case 5 -> {
                    mostrarBusMasConductores(vectorAutobuses);
                }
            }
        } while (menu != 6);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Aparcar");
        System.out.println("2. Mostrar darsenas libres");
        System.out.println("3. Buscar autobus por matricula");
        System.out.println("4. Buscar conductor");
        System.out.println("5. Mostrar posicion del autobus con mas conductores");
    }

    public static void aparcarBus(Autobus[] vectorAutobuses) {
        String matricula;
        boolean continuar, valida;
        System.out.print("Introduce la matricula del autobus: ");
        matricula = pedirString();
        Autobus nuevo = new Autobus(matricula); // Crea el objeto asignando una matricula
        do { // Primer bucle para añadir conductores al HashMap de conductores del bus
            String dni, nombre;
            System.out.print("Introduce el dni del conductor: ");
            dni = pedirString();
            System.out.print("Introduce el nombre del conductor: ");
            nombre = pedirString();
            nuevo.getListaConductores().put(dni, nombre);
            continuar = comprobarRespuesta();
        } while (continuar);
        do { // Segundo bucle para aparcar el bus, si la posicion está fuera del vector o está ocupada se vuelve a pedir una posición
            System.out.print("Introduce la posicion del Autobus: ");
            int posicion = pedirInt();
            if (vectorAutobuses[posicion] == null && (posicion >= 0 && posicion < vectorAutobuses.length)) {
                vectorAutobuses[posicion] = nuevo;
                valida = true;
            } else {
                System.err.println("Plaza ocupada o fuera de los limites");
                valida = false;
            }
        } while (!valida);
    }

    public static boolean comprobarRespuesta() {
        boolean valida;
        boolean continuar = false;
        do {
            System.out.println("Desea continuar introduciendo conductores?");
            String respuesta = pedirString();
            if (respuesta.equalsIgnoreCase("Si")) {
                valida = true;
                continuar = true;
            } else if (respuesta.equalsIgnoreCase("No")) {
                valida = true;
                continuar = false;
            } else {
                System.err.println("Respuesta no valida Si/No");
                valida = false;
            }
        } while (!valida);
        return continuar;
    }

    public static void mostrarDarsenasLibres(Autobus[] vectorAutobuses) { // Recorre el vector y muestra las plazas libres
        System.out.println("PLAZAS LIBRES");
        for (int i = 0; i < vectorAutobuses.length; i++) {
            if (vectorAutobuses[i] == null) {
                System.out.println(i);
            }
        }
    }

    public static void buscarMatricula(Autobus[] vectorAutobuses) { // Se busca en el vector un bus con una matricula definida por el usuario, si lo encuentra muestra el vehículo
        String matricula;
        int i = 0;
        boolean encontrado = false;
        System.out.println("Introduce la matricula del vehiculo: ");
        matricula = pedirString();
        while (i < vectorAutobuses.length || !encontrado) {
            if (vectorAutobuses[i].getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println(vectorAutobuses[i]);
                encontrado = true;
            } else {
                i++;
            }
        }
    }

    public static void buscarConductor(Autobus[] vectorAutobuses) {
        String dni;
        boolean encontrado = false;

        System.out.println("Introduce el dni del conductor: ");
        dni = pedirString();

        for (Autobus busI : vectorAutobuses) { // Se busca un conductor según su dni, si lo encuentra muestra todos los vehículos a los que está asignado
            if (busI != null) {
                if (busI.getListaConductores().containsKey(dni)) {
                    System.out.println("Conductor encontrado");
                    System.out.println(busI.getMatricula());
                    System.out.println("Nombre: " + busI.getListaConductores().get(dni));
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado ningun conductor con ese DNI");
        }
    }

    public static void mostrarBusMasConductores(Autobus[] vectorAutobuses) { // Muestra el bus con mayor número de conductores
        int maxConductores = -1;
        String matriculaBus = "";
        for (Autobus busI : vectorAutobuses) {
            if (busI != null) {
                if (busI.getListaConductores().size() > maxConductores) {
                    maxConductores = busI.getListaConductores().size();
                    matriculaBus = busI.getMatricula();
                }
            }
        }
        System.out.println("La matricula del autobus con mas conductores asignados es: " + matriculaBus + " con " + maxConductores + " conductores");
    }

    public static int pedirInt() {
        Scanner entradaInt = new Scanner(System.in);
        int entero = entradaInt.nextInt();
        return entero;
    }

    public static String pedirString() {
        Scanner entradaString = new Scanner(System.in);
        String cadena = entradaString.nextLine();
        return cadena;
    }
}
