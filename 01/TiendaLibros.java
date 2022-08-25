import java.util.Scanner;

public class TiendaLibros {
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = consola.nextLine();

        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el precio: ");
        var precio = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el envio gratuito: ");
        var envio = consola.nextLine();

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envio);

    }
}