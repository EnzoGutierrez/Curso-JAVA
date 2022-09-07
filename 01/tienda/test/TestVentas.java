package tienda.test;

import tienda.domain.Orden;
import tienda.domain.Producto;

public class TestVentas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Remera", 500.0);
        Producto producto2 = new Producto("Pantalon", 800.0);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden1.mostrarOrden();
    }
}
