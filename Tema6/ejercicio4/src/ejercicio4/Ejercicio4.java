package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Animal perro = new Perro("Dog", 4, 30);
        Animal gato = new Gato("Cat", 7, 10);
        Animal leon = new Leon("Lion", 5, 180);
        Animal lobo = new Lobo("Wolf", 8, 50);
        
        perro.mostrarAnimal();
        gato.mostrarAnimal();
        leon.mostrarAnimal();
        lobo.mostrarAnimal();
        
        Perro perro2 = new Perro("Dog2", 4, 30);
        Gato gato2 = new Gato("Cat2", 7, 10);
        Leon leon2 = new Leon("Lion2", 5, 180);
        Lobo lobo2 = new Lobo("Wolf2", 8, 50);
        
        perro2.mostrarAnimal();
        gato2.mostrarAnimal();
        leon2.mostrarAnimal();
        lobo2.mostrarAnimal();  
    }
}
