package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public class Perro extends Canido {

    //Constructores
    public Perro() {
    }

    public Perro(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    //Mostrar
    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Ladrido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Carnivoro");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: Domestico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre cientifico: Canis lupus familiaris");
    }
}
