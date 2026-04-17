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
        try {
            try (FileReader fr = new FileReader("datos_empleados.txt"); BufferedReader br = new BufferedReader(fr);) {
                
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo");
        }
    }
    
    

}
