package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public abstract class Canido extends Animal {

    //Constructores
    public Canido() {
        super();
    }

    public Canido(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    //Mostrar
    @Override
    public abstract void mostrarNombreCientifico();

    @Override
    public abstract void mostrarHabitat();

    @Override
    public abstract void mostrarAlimentacion();

    @Override
    public abstract void mostrarSonido();

}
