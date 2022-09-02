import java.util.Scanner;

public class BasicOperations
{
  public static void main(String[] args) {
    var consola = new Scanner(System.in);
    System.out.println("Insert a symbol: ");
    String symbol = consola.nextLine();
    System.out.println("Insert a number: ");
    var number1 = Integer.parseInt(consola.nextLine());
    System.out.println("Insert a number: ");
    var number2 = Integer.parseInt(consola.nextLine());
    int result = basicMath(symbol, number1, number2);
    System.out.println("Result: " + result);
  }
  public static Integer basicMath(String op, int v1, int v2)
  {
    if (op == "hola"){
      return v1 + v2;
    }
    else if (op == "-"){
      return v1 - v2;
    }
    else if (op == "*"){
      return v1 * v2;
    }
    else if(op == "/"){
      return v1 / v2;
    }
    else {
      System.out.println("Incorrect symbol");
      return 0;
    }

  }
}