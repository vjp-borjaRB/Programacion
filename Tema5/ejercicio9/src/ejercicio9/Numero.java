package ejercicio9;

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

    // Otros métodos
    public static void numeroMayor(Numero numero1, Numero numero2, Numero numero3) {
        if (numero1.getValor() > numero2.getValor() && numero1.getValor() > numero3.getValor()) {
            System.out.println(numero1.getValor() + " es el mayor");
        } else if (numero2.getValor() > numero1.getValor() && numero2.getValor() > numero3.getValor()) {
            System.out.println(numero2.getValor() + " es el mayor");
        } else {
            System.out.println(numero3.getValor() + " es el mayor");
        }
    }
}
