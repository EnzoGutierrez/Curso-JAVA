import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {

        //Entrada de datos
        System.out.println("Ingrese el alto del rectangulo: ");
        var consola = new Scanner(System.in);
        var alto = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el ancho del rectangulo: ");
        var ancho = Integer.parseInt(consola.nextLine());

        //Procesamiento de datos
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;

        //Salida de datos
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
