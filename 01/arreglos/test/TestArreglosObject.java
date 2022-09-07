package arreglos.test;

import arreglos.domain.*;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[3];

        personas[0] = new Persona("Enzo");
        personas[1] = new Persona("Juan");
        personas[2] = new Persona("Tefi");

        for (int i = 0; i < personas.length; i++){
            System.out.println("Persona " + i + " = " + personas[i]);
        }
    }
}