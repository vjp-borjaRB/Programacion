package ejercicio1;

/**
 *
 * @author Borja Romero
 */
public class Suma extends Calculadora {

    // Atributos
    private double sumando;

    //Constructores
    public Suma() {
        super();
        sumando = 0;
    }

    public Suma(double numero, double sumando) {
        super(numero);
        this.sumando = sumando;
    }

    @Override
    public void realizarOperacion() {
        System.out.println(sumando + getNumero());
    }
    
    
}
