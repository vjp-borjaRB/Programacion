package ejercicio10c;

/**
 *
 * @author Borja Romero
 */
public class Electrodomestico implements ConsumoEnergetico {

    private float kwh;
    private float precioKwh;
    private float eficiencia;

    public Electrodomestico() {
        kwh = 0;
        precioKwh = 0;
        eficiencia = 0;
    }

    public Electrodomestico(float kwh, float precioKwh, float eficiencia) {
        this.kwh = kwh;
        this.precioKwh = precioKwh;
        this.eficiencia = eficiencia;
    }

    public double getKwh() {
        return kwh;
    }

    public double getPrecioKwh() {
        return precioKwh;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setKwh(float kwh) {
        this.kwh = kwh;
    }

    public void setPrecioKwh(float precioKwh) {
        this.precioKwh = precioKwh;
    }

    public void setEficiencia(float eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public float calcularConsumo(float horasDeUso) {
        float consumo;
        consumo = horasDeUso * precioKwh * eficiencia;
        return consumo;
    }

    @Override
    public float calcularFactura(float horasDeUso) {
        float consumo = calcularConsumo(horasDeUso);
        float factura = consumo * precioKwh;
        return factura;
    }

}
