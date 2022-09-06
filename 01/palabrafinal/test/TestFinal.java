package palabrafinal.test;

import palabrafinal.domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("Mi Variable: " + miVariable);
        System.out.println("Mi constante: " + Persona.MiConstante);

        final Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("Persona 1 nombre: " + persona1.getNombre());
        persona1.setNombre("Enzo");
        System.out.println("Persona 1 nombre: " + persona1.getNombre());
    }
}
