package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public class Leon extends Felino {

    public Leon() {
        super();
    }

    public Leon(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Rugido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Carnivoro");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: Sabana");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre cientifico: Panthera leo");
    }

}
