package d_inversion_dependencia;

public class MensajeroSimulado implements Mensajero {
    @Override
    public String transmitir(String texto) {
        return "Mensaje de prueba transmitido";
    }
}