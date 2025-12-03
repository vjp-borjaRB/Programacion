package ejercicio1;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Suma suma1 = new Suma(10, 20);
        Multiplicacion multiplicacion1 = new Multiplicacion(10, 20);
        Potencia potencia1 = new Potencia(10, 20);
        suma1.realizarOperacion();
        multiplicacion1.realizarOperacion();
        potencia1.realizarOperacion();

        Calculadora suma = new Suma(5, 10);
        suma.realizarOperacion();
        Calculadora multiplicacion = new Multiplicacion(5, 10);
        multiplicacion.realizarOperacion();
        Calculadora potencia = new Potencia(5, 10);
        potencia.realizarOperacion();

    }

}
