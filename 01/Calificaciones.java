import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        System.out.println("Ingrese la nota a calificar: ");
        var consola = new Scanner(System.in);
        var nota = Integer.parseInt(consola.nextLine());
        switch(nota){
            case 0: case 1: case 2: case 3: case 4: case 5:{
                System.out.println("Calificacion de F");
                break;
            }
            case 6:{
                System.out.println("Calificacion de D");
                break;
            }
            case 7:{
                System.out.println("Calificacion de C");
                break;
            }
            case 8:{
                System.out.println("Calificacion de B");
                break;
            }
            case 9: case 10:{
                System.out.println("Calificacion de A");
                break;
            }
            default:{
                System.out.println("Valor desconocido");
                break;
            }
        }
    }
    
}
