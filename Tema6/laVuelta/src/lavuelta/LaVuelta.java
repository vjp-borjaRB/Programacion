package lavuelta;

/**
 *
 * @author Borja Romero
 */
public class LaVuelta {

    public static void main(String[] args) {
        CiclistaEscalador escalador = new CiclistaEscalador(15, 2, "Antonio", true, 22, 40);
        CiclistaSprinter sprinter = new CiclistaSprinter(6, "David", false, 25, 30);
        
        System.out.println(escalador.toString());
        /*
        Ciclista escalador2 = (Ciclista) escalador;
        System.out.println(escalador2.toString());
        escalador2.comer();
        escalador2.beber();
        System.out.println(escalador2.toString());
        Ciclista sprinter2 = (Ciclista) sprinter;
        System.out.println(sprinter2.toString());
        sprinter2.comer();
        sprinter2.beber();
        System.out.println(sprinter2.toString());

        Pedaleable escalador3 = (Pedaleable) escalador;
        System.out.println(escalador3.toString());
        escalador3.atacar();
        escalador3.recuperar(5);
        escalador3.sprintar();
        System.out.println(escalador3.toString());
        Pedaleable sprinter3 = (Pedaleable) escalador;
        System.out.println(sprinter3.toString());
        sprinter3.atacar();
        sprinter3.recuperar(40);
        sprinter3.sprintar();
        System.out.println(sprinter3.toString()); */

    }
}
