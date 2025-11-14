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
        Bicicleta.aumentarContadorBicicleta();

        Bicicleta bici2 = new Bicicleta("BH", "Rojo", "Carretera", 15);
        Bicicleta.aumentarContadorBicicleta();
        Bicicleta bici3 = new Bicicleta("Mitical");
        bici3.setColor("Verde");
        bici3.setTipo("Montana");
        bici3.setAntiguedad(6);
        Bicicleta.aumentarContadorBicicleta();

        bici1.mostrarBicicleta();
        System.out.println(bici2.toString());
        System.out.println(bici2);
        System.out.println(bici2.getMarca());
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();

        //Mostrar bici3
        bici3.mostrarBicicleta();
        System.out.println(Bicicleta.getContadorBicicleta());
        
    }
}
