package pruebaclase;

/**
 *
 * @author alumno
 */
public class PruebaClase {

    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montania");
        bici1.setAntiguedad(6);

        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("BH");
        bici2.setColor("Rojo");
        bici2.setTipo("Carretera");
        bici2.setAntiguedad(15);

        bici1.mostrarBicicleta();
        bici2.mostrarBicicleta();
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();
    }

}
