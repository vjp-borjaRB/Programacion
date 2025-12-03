package ejercicio1;

/**
 *
 * @author Borja Romero
 */
public class Multiplicacion extends Calculadora {

    //Atributos
    private double multiplicador;

    //Constructores
    public Multiplicacion() {
        super();
        multiplicador = 0;
    }

    public Multiplicacion(double numero, double multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }

    @Override
    public void realizarOperacion() {
        System.out.println(multiplicador * getNumero());
    }
}
