package clubdeportivo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Borja Romero
 */
public class ClubDeportivo {

    public static void main(String[] args) {
        ArrayList<Deporte> listaDeportes = new ArrayList<>();
        mainMenu(listaDeportes);
    }

    public static void mainMenu(ArrayList<Deporte> listaDeportes) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    addDeporte(listaDeportes);
                }
                case 2 -> {
                    mostrarDeportesEquipos(listaDeportes);
                }
                case 3 -> {
                    buscarEquipo(listaDeportes);
                }
                case 4 -> {
                    mostrarMapaEquipos(listaDeportes);
                }
                case 5 -> {
                    mostrarEquiposOrdenados(listaDeportes);
                }
            }
        } while (menu != 6);
    }

    public static void addDeporte(ArrayList<Deporte> listaDeportes) {
        String nombreDeporte;
        boolean continuar;
        System.out.print("Introduce el nombre del deporte: ");
        nombreDeporte = pedirString();
        Deporte nuevoDeporte = new Deporte(nombreDeporte); // Crear el objeto deporte
        do { // Bucle para seguir introduciendo equipos si lo desea el usuario
            String nombreEquipo;
            int trofeosGanados;
            int codigoEquipo;
            System.out.print("Introduce el nombre del equipo: ");
            nombreEquipo = pedirString();
            System.out.print("Introduce el codigo del equipo: ");
            codigoEquipo = pedirInt();
            System.out.print("Introduce el numero de trofeos ganados: ");
            trofeosGanados = pedirInt();
            Equipo nuevoEquipo = new Equipo(codigoEquipo, nombreEquipo, trofeosGanados); // Crear equipo
            nuevoDeporte.getEquipos().add(nuevoEquipo); // Añadir el equipo al HashSet de equipos del objeto deporte
            continuar = comprobarRespuesta();
        } while (continuar);
        listaDeportes.add(nuevoDeporte); // Añadir a la lista de deportes el deporte creado
    }

    public static boolean comprobarRespuesta() { // Método para preguntar al usuario si desea continuar
        String respuesta;
        boolean valida;
        boolean continuar = false;
        do {
            System.out.println("Desea continuar introduciendo equipos? Si/No");
            respuesta = pedirString();
            if (respuesta.equalsIgnoreCase("Si")) {
                valida = true;
                continuar = true;
            } else if (respuesta.equalsIgnoreCase("No")) {
                valida = true;
                continuar = false;
            } else {
                valida = false;
                System.err.println("Respuesta no valida");
            }
        } while (!valida);
        return continuar;
    }

    public static void mostrarDeportesEquipos(ArrayList<Deporte> listaDeportes) { // Muestra cada deporte de la lista con su respectivos equipos
        for (Deporte deporteI : listaDeportes) {
            System.out.println("Deporte -> " + deporteI.getNombre());
            deporteI.mostrarEquipos();
        }
    }

    public static void buscarEquipo(ArrayList<Deporte> listaDeportes) { // Buscar el equipo que el usuario nos de y mostrar el deporte al que pertenece, usa un método de la clase Deporte
        String nombreEquipo;
        boolean encontrado = false;
        int i = 0;
        System.out.print("Introduce el nombre del equipo: ");
        nombreEquipo = pedirString();
        while (i < listaDeportes.size() && !encontrado) {
            if (listaDeportes.get(i).buscarEquipo(nombreEquipo)) {
                System.out.println(listaDeportes.get(i).getNombre());
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.err.println("No se encontro el equipo");
        }
    }

    public static void mostrarEquiposOrdenados(ArrayList<Deporte> listaDeportes) { // Volcar todos los equipos de todos los deportes y ordenarlos por títulos conseguidos
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        for (Deporte deporteI : listaDeportes) {
            for (Equipo equipoI : deporteI.getEquipos()) {
                listaEquipos.add(equipoI);
            }
        }
        Collections.sort(listaEquipos);
        for (Equipo equipoI : listaEquipos) {
            System.out.println(equipoI);
        }
    }

    public static void mostrarMapaEquipos(ArrayList<Deporte> listaDeportes) { // Volcar equipos a un HasMap (sólo los que han ganado mas de 3 títulos)
        HashMap<Integer, Equipo> mapaEquipos = new HashMap<>();
        for (Deporte deporteI : listaDeportes) {
            for (Equipo equipoI : deporteI.getEquipos()) {
                if (equipoI.getTrofeosGanados() > 3) {
                    mapaEquipos.put(equipoI.getCodigo(), equipoI);
                }
            }
        }
        mapaEquipos.forEach((clave, valor) -> {
            System.out.println(clave + "->" + valor);
        });

    }

    public static void mostrarOpciones() {
        System.out.println("1. Add deporte");
        System.out.println("2. Mostrar deportes y equipos");
        System.out.println("3. Buscar equipo en deporte");
        System.out.println("4. Mostrar mapa de equipos");
        System.out.println("5. Mostrar equipos de deportes ordenados por numero de trofeos ganados");
        System.out.println("6. Salir del programa");
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
