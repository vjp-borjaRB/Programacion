package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public abstract class Canido extends Animal {

    public Canido() {
        super();
    }

    public Canido(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public abstract void mostrarNombreCientifico();

    @Override
    public abstract void mostrarHabitat();

    @Override
    public abstract void mostrarAlimentacion();

    @Override
    public abstract void mostrarSonido();

}
