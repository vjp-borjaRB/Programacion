package ejercicio7;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Televisor tele = new Televisor();
        Radio radio = new Radio();

        tele.encender();
        System.out.println(tele);
        for (int i = 0; i <= 2; i++) {
            tele.subirVolumen();
        }
        System.out.println(tele.getVolumen());
        tele.cambiarCanal(8);
        tele.bajarVolumen();
        tele.apagar();
        System.out.println(tele);

        radio.encender();
        System.out.println(radio);
        for (int i = 0; i <= 2; i++) {
            radio.subirVolumen();
        }
        System.out.println(radio.getVolumen());
        radio.cambiarCanal(97.1f);
        radio.bajarVolumen();
        radio.apagar();
        System.out.println(radio);

    }

}
