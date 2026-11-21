package o_abierto_cerrado;

public class GestorCobros {
    public double ejecutarCobro(FormaPago formaPago, double monto) {
        return formaPago.pagar(monto);
    }
}