package ejercicio10;

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
    public static void ordenarNumeros(Numero numero1, Numero numero2, Numero numero3, Numero numero4) {
        int aux;
        int num1 = numero1.getValor();
        int num2 = numero2.getValor();
        int num3 = numero3.getValor();
        int num4 = numero4.getValor();

        /*Se comparan los números dos a dos y se cambia el valor de las variables utilizando una variable auxiliar 
        (el proceso se repite n-1 veces siendo n la cantidad de numeros introducidos).*/
        
        for (int i = 0; i < 3; i++) {
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
            if (num3 > num4) {
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
        System.out.println("El orden de los numeros introducidos es: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
    }
}
