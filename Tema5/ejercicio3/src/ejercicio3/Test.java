package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class Test {

    public static void main(String[] args) {
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();

        rueda1.establecerMaterial("caucho1");
        rueda2.establecerMaterial("caucho2");
        rueda1.establecerPulgadas(18);
        rueda2.establecerPulgadas(19);

        System.out.println(rueda1.obtenerMaterial());
        System.out.println(rueda2.obtenerMaterial());
        System.out.println(rueda1.obtenerPulgadas());
        System.out.println(rueda2.obtenerPulgadas());

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        coche1.establecerMarca("Mercedes-Benz");
        coche1.establecerModelo("s63");
        coche1.establecerRueda(rueda1);
        coche2.establecerMarca("BMW");
        coche2.establecerModelo("e92");
        coche2.establecerRueda(rueda2);
        coche3.establecerMarca("Audi");
        coche3.establecerModelo("s4");
        coche3.establecerRueda(rueda1);

        System.out.println(coche1.obtenerMarca());
        System.out.println(coche1.obtenerModelo());
        System.out.println(coche1.obtenerRueda().obtenerPulgadas());
        System.out.println(coche1.obtenerRueda().obtenerMaterial());

        System.out.println(coche2.obtenerMarca());
        System.out.println(coche2.obtenerModelo());
        System.out.println(coche2.obtenerRueda().obtenerPulgadas());
        System.out.println(coche2.obtenerRueda().obtenerMaterial());

        System.out.println(coche3.obtenerMarca());
        System.out.println(coche3.obtenerModelo());
        System.out.println(coche3.obtenerRueda().obtenerPulgadas());
        System.out.println(coche3.obtenerRueda().obtenerMaterial());
    }

}
