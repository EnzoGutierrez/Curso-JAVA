package Caja;

public class Caja {
    //Atributos de la clase
    int ancho;
    int alto;
    int profundo;

    //Constructor vacio
    public Caja(){
        System.out.println("Ejecutando constructor");
    }

    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    //Metodo
    public int CalcularVolumen(){
        return alto * ancho * profundo;
    }
}
