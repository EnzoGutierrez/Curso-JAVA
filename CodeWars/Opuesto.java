import java.util.Scanner;

public class Opuesto
    {
        public static void main(String[] args) {
            System.out.println("Insert a number: ");
            var consola = new Scanner(System.in);
            var number = Integer.parseInt(consola.nextLine());
            var numberOpposite = opposite(number);
            System.out.println("Opposite number: " + numberOpposite);
    }
        public static int opposite(int number)
        {
            // your code here
            if (number == 0){
                return 0;
            } 
            else if (number > 0){
                int numberOpposite = 0 - number;
                return numberOpposite;
            } else {
                int numberOpposite = number + (number * -2);
                return numberOpposite;
            }
        }
    }