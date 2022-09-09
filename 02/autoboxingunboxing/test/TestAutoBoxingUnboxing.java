package autoboxingunboxing.test;

public class TestAutoBoxingUnboxing {
    public static void main(String[] args) {

        //Clases envolventes de tipos primitivos
        // int - Integer
        // long - Long
        // float - Float
        // double - Double
        // boolean - Boolean
        // byte - Byte
        // char - Character
        // short - Short

        Integer entero = 15; //Autoboxing
        System.out.println("Entero: " + entero);
        System.out.println("Entero double: " + entero.doubleValue());

        int entero2 = entero; //Unboxing
        System.out.println("Entero 2: " + entero2);
    }
}
