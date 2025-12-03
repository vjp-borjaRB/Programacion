package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public class Lobo extends Canido {

    //Constructores
    public Lobo() {
        super();
    }

    public Lobo(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    //Mostrar
    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Carnivoro");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: Bosque");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre cientifico: Canis lupus");
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Aullido");
    }
}
