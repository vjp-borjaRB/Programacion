package ejercicio8;

/**
 *
 * @author Borja Romero
 */
public class Numero {

    // Atributos
    private int valor;

    // Constructores
    public Numero() {
        valor = 0;
    }

    public Numero(int valor) {
        this.valor = valor;
    }

    // Set & Get
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    // Mostrar 
    @Override
    public String toString() {
        return "Numero{" + "valor=" + valor + '}';
    }

    public static void parImpar(Numero numero1) {
        if (numero1.getValor() % 2 == 0) {
            System.out.println("El numero introducido es par");
        } else {
            System.out.println("El numero introducido es impar");
        }
    }
}
