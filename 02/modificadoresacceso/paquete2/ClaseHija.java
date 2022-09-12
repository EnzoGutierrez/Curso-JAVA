package modificadoresacceso.paquete2;

import modificadoresacceso.paquete1.Clase2;

public class ClaseHija extends Clase2 {
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion de atributo protected";
        metodoProtected();
    }
}
