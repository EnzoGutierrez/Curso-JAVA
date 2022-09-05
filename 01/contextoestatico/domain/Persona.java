package contextoestatico.domain;

public class Persona {
    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre){
        this.nombre = nombre;
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersonas(){
        return idPersona;
    }

    public void setIdPersonas(int idPersona){
        this.idPersona = idPersona;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public static int setContadorPersonas(){
        return contadorPersonas;
    }

    public void getContadorPersonas(int contadorPersonas){
        Persona.contadorPersonas = contadorPersonas;
    }

    public String toString(){
        return "Persona [" + "id: " + idPersona +
                ", Nombre: " + nombre + "]";
    }
}
