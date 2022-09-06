package herencia.domain;

public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona(){

    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public char getGenero(){
        return this.genero;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String toString(){
        return "Persona [Nombre: " + nombre +
                ", Genero: " + genero +
                ", Edad: " + edad +
                ", Direccion: " + direccion + "]";
    }
}


