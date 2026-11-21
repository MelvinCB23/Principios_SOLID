package o_abierto_cerrado;

public class CobroTransferencia implements FormaPago {
    @Override
    public double pagar(double monto) {
        return monto;
    }
}