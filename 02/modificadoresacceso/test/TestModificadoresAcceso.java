package modificadoresacceso.test;

import modificadoresacceso.paquete1.Clase1;
import modificadoresacceso.paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("Clase 1: " + clase1.atributoPublico);
        clase1.metodoPublico();

        ClaseHija claseHija = new ClaseHija();
        System.out.println("Clase Hija:" + claseHija);
    }

    
}
