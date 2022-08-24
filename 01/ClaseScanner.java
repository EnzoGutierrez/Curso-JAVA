import java.util.Scanner;

public class ClaseScanner {
    public static void main(String args[]){
        // System.out.println("Escribe tu nombre: ");
        // Scanner consola = new Scanner(System.in);
        // var usuario = consola.nextLine();
        // System.out.println("Usuario = " + usuario);

        // System.out.println("Escribe tu titulo: ");
        // var titulo = consola.nextLine();
        // System.out.println("Resultado = " + titulo + " " + usuario);

        System.out.println("Ingresa el nombre del libro: ");
        try (Scanner consola = new Scanner(System.in)) {
            var libro = consola.nextLine();
            System.out.println("Ingresa el nombre del autor: ");
            var nombre = consola.nextLine();
            System.out.println(libro + " fue escrito por " + nombre);
        }

    }
}
