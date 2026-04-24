package ejercicio14;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        ArrayList<Becario> becarios = new ArrayList<>();
        importarBecarios(becarios);
        mostrarBecados(becarios);
    }

    public static void importarBecarios(ArrayList<Becario> becarios) {
        try {
            String linea;
            try (FileReader fr = new FileReader("DatosBeca.txt"); BufferedReader br = new BufferedReader(fr);) {
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split(":");
                    String nombreApellidos = datos[0];
                    String sexo = datos[1];
                    int edad = Integer.parseInt(datos[2]);
                    int numeroSuspensos = Integer.parseInt(datos[3]);
                    boolean residenciaFamiliar;
                    residenciaFamiliar = datos[4].equalsIgnoreCase("Si");
                    int ingresos = Integer.parseInt(datos[5]);
                    Becario nuevo = new Becario(nombreApellidos, sexo, edad, numeroSuspensos, residenciaFamiliar, ingresos);
                    becarios.add(nuevo);
                }
            }
        } catch (FileNotFoundException nf) {
            System.err.println("No se encuentra el archivo");
        } catch (IOException io) {
            System.err.println("Error al leer el archivo");
        }
    }

    public static void mostrarBecados(ArrayList<Becario> becarios) {
        int baseFija = 1500;
        for (Becario becarioI : becarios) {
            int totalBeca = 0;
            if (becarioI.getIngresos() <= 12000) {
                totalBeca += 500;
            }
            if (becarioI.getEdad() < 23) {
                totalBeca += 200;
            }
            if (!becarioI.getResidenciaFamiliar()) {
                totalBeca = 1000;
            }
            if (becarioI.getNumeroSuspensos() == 0) {
                totalBeca += 500;
            } else if (becarioI.getNumeroSuspensos() == 1) {
                totalBeca += 200;
            }
            totalBeca += baseFija;
            if (becarioI.getNumeroSuspensos() > 2) {
                totalBeca = 0;
            }
            if (totalBeca != 0) {
                System.out.println(becarioI.getNombreApellido() + ":" + totalBeca);
            }
        }
    }
}
