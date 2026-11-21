package i_segregacion_interfaces;

import org.junit.Test;

public class MaquinaAutomatizadaTest {
    @Test
    public void maquinaDebeOperarCorrectamente() {
        MaquinaAutomatizada maquina = new MaquinaAutomatizada();
        maquina.operar();
    }
}