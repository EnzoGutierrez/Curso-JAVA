package foreach.test;
import foreach.domain.Persona;;

public class TestForEach{
    public static void main(String[] args) {
        int edades[] = {5, 2, 4, 8};
        for(int edad: edades){
            System.out.println("Edad: " + edad);
        }

        Persona personas[] = {new Persona("Juan"), new Persona("Enzo"), new Persona("Gaston")};

        for(Persona persona: personas){
            System.out.println(persona);
        }
    }
}
