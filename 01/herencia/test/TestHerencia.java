package herencia.test;

import java.util.Date;

import herencia.domain.Cliente;
import herencia.domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Enzo", 2000.0);
        System.out.println(empleado1);

        Cliente cliente1 = new Cliente("Enzo", new Date(), true);
        System.out.println(cliente1);
    }
}
