package encapsulamiento.test;

import encapsulamiento.dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Enzo", 1000, false);
        persona1.setNombre("Juan");
        System.out.println("Nombre de persona 1: " + persona1.getNombre());
        System.out.println("Sueldo de persona 1: " + persona1.getSueldo());
        System.out.println("Personal eliminado: " + persona1.isEliminado());
        System.out.println("Persona 1: " + persona1.toString());
    }
}
