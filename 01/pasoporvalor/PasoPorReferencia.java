package pasoporvalor;
import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Enzo";
        System.out.println("Persona1 nombre = " + persona1.nombre);

        cambiarValor(persona1);

        System.out.println("Persona1 nombre cambiado = " + persona1.nombre);
    }

    public static void cambiarValor(Persona persona){
        persona.nombre = "Juan";
    }
}
