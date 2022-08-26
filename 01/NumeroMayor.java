import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        //Entrada de datos
        System.out.println("Ingrese el primer numero: ");
        var consola = new Scanner(System.in);
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        var num2 = Integer.parseInt(consola.nextLine());

        //Procesamiento de datos
        if (num1 > num2){
            System.out.println("Numero mayor: " + num1);
        }
        else{
            System.out.println("Numero mayor: " + num2);
        }
    }
}
