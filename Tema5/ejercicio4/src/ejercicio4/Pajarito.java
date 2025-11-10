package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public class Pajarito {
    
    static int numpajaros = 0;
    String color;
    int edad;
    
    static void nuevopajaro() {
    numpajaros++;
    }
    
    public void establecerColoryEdad(String col, int ed) {
    color = col;
    edad = ed;
    nuevopajaro();
    }
    
    static int muestraPajaros() {
        return numpajaros;
    }
    
}
