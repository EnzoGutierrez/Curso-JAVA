package ventaPc.test;

import ventaPc.domain.Raton;
import ventaPc.domain.Teclado;
import ventaPc.domain.Computadora;
import ventaPc.domain.Monitor;
import ventaPc.domain.Orden;

public class TestVentaPc {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("USB", "Razer");
        Raton raton1 = new Raton("USB", "Razer");
        Monitor monitor1 = new Monitor("Samsung", 24.0);

        Computadora computadora1 = new Computadora("ProMax10", monitor1, teclado1, raton1);

        Teclado teclado2 = new Teclado("Wireless", "Logitech");
        Raton raton2 = new Raton("Wireless", "Logitech");
        Monitor monitor2 = new Monitor("Philips", 20.0);

        Computadora computadora2 = new Computadora("Normalita", monitor2, teclado2, raton2);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora2);
        orden2.agregarComputadora(computadora2);
        orden2.mostrarOrden();

    }
}
