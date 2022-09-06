package operaciones.test;

import operaciones.domain.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(20.3, 1.2);
        System.out.println(resultado);

        resultado = Operaciones.sumar(2, 3);
        System.out.println(resultado);
    }
}
