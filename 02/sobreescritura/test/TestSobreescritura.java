package sobreescritura.test;

import sobreescritura.domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 1000, "RRHH");
        System.out.println("Gerente 1: " + gerente1.ObtenerDetalles());

    }
}
