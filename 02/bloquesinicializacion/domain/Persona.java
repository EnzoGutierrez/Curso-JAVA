package bloquesinicializacion.domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;

    static{
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersona;
    }

    {
        System.out.println("Ejecucion del bloque No estatico");
        this.idPersona = Persona.contadorPersona++;    
    }

    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona(){
        return idPersona;
    }

    public String toString(){
        return "Id: " + idPersona;
    }
}
