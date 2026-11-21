package o_abierto_cerrado;

public class CobroTarjeta implements FormaPago {
    @Override
    public double pagar(double monto) {
        return monto;
    }
}