package l_sustitucion_liskov;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReservaNaturalTest {
    @Test
    public void canarioDebeComportarseComoPajaro() {
        ReservaNatural reserva = new ReservaNatural();
        Pajaro pajaro = new Canario();
        String accion = reserva.darAlimento(pajaro);
        assertEquals("El pájaro está alimentándose", accion);
    }
}