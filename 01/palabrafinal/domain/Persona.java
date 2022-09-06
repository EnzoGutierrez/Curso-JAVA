package palabrafinal.domain;

public class Persona {
    public final static int MiConstante = 1;

    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }

    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
