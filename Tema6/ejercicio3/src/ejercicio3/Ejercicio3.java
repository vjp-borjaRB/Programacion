package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo("rojo", 2);
        Cuadrado cuadrado = new Cuadrado("azul", 3);
        Rectangulo rectangulo = new Rectangulo("amarillo", 3, 5);
        TrianguloRectangulo trianguloRectangulo= new TrianguloRectangulo("negro", 4, 7);

        circulo.calcularArea();
        circulo.calcularPerimetro();
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        trianguloRectangulo.calcularArea();
        trianguloRectangulo.calcularPerimetro();
        trianguloRectangulo.calcularHipotenusa();
    }
    
}
