package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Enzo", "Gutierrez");
        System.out.println("Persona: " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apeliido: " + persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this" + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public Imprimir(){
        super();
    }

    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}