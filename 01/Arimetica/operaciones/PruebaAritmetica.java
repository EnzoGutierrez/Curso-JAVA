package Arimetica.operaciones;

public class PruebaAritmetica{
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 2;
        aritmetica1.b = 6;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde clase con retorno: " + resultado);

        int resultado1 = aritmetica1.sumarConArgumentos(2, 6);
        System.out.println("Resultado desde clase con argumentos: " + resultado1);

        Aritmetica aritmetica2 = new Aritmetica();
        System.out.println("Aritmetica a: " + aritmetica2.a);
        System.out.println("Aritmetica b: " + aritmetica2.b);

        Aritmetica aritmetica3 = new Aritmetica(2, 6);
        System.out.println("Aritmetica a: " + aritmetica3.a);
        System.out.println("Aritmetica b: " + aritmetica3.b);
    }
}