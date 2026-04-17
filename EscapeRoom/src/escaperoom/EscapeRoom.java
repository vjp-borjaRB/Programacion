package escaperoom;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author Borja Romero
 */
public class EscapeRoom {

    public static void main(String[] args) {
        aislarRegistros();
    }

    public static void aislarRegistros() {
        try {
            String lineas = "";
            int contadorEmpleados = 0;
            try (FileReader fr = new FileReader("datos_empleados.txt"); BufferedReader br = new BufferedReader(fr);) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.contains("Zona Cero")) {
                        lineas += (linea + "\n");
                        contadorEmpleados++;
                    }
                }
            }
            try (FileWriter fwr = new FileWriter("sospechosos_zona_cero.txt"); PrintWriter pwr = new PrintWriter(fwr)) {
                pwr.print(lineas);
            }
            System.out.println("El numero de empleados en Zona Cero es " + contadorEmpleados);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo");
        }
    }

    public static void buscarClaves() {

    }

}
