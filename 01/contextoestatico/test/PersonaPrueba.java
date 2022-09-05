package contextoestatico.test;
import contextoestatico.domain.*;;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Enzo");
        Persona persona2 = new Persona("Juan");

        imprimir(persona1);
        imprimir(persona2);
    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
