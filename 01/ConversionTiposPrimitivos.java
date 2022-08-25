import java.util.Scanner;

public class ConversionTiposPrimitivos{
    public static void main(String args[]){
        //String a INT
        var edad = Integer.parseInt("20");
        System.out.println("Edad de " + (edad + 2));

        var valorPi = Double.parseDouble("3.1416");
        System.out.println("Valor de Pi: " + valorPi);

        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println(edad);

        var edadTexto = String.valueOf(10);
        System.out.println("Edad texto: " + edadTexto);

        var character = "hola".charAt(1);
        System.out.println("Caracter = " + character);

        System.out.println("Proporciona un caracter");
        character = consola.nextLine().charAt(0);
        System.out.println("Caracter = " + character);
    }
}