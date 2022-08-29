package Arimetica.operaciones;

public class Aritmetica{
    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }

    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }
    public int sumarConRetorno(){
        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        return a + b;
    }
}
