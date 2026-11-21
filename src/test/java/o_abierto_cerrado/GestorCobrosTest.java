package o_abierto_cerrado;

import org.junit.Test;
import static org.junit.Assert.*;

public class GestorCobrosTest {
    @Test
    public void deberiaRealizarCobroConTarjeta() {
        GestorCobros gestor = new GestorCobros();
        FormaPago tarjeta = new CobroTarjeta();
        double montoFinal = gestor.ejecutarCobro(tarjeta, 250.0);
        assertEquals(250.0, montoFinal, 0.001);
    }

    @Test
    public void deberiaRealizarCobroConTransferencia() {
        GestorCobros gestor = new GestorCobros();
        FormaPago transferencia = new CobroTransferencia();
        double montoFinal = gestor.ejecutarCobro(transferencia, 250.0);
        assertEquals(250.0, montoFinal, 0.001);
    }
}