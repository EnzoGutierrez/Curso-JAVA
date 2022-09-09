package enumeraciones.test;

import enumeraciones.enumeracion.Continentes;
import enumeraciones.enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        indicarDiaSemana(Dias.LUNES);

        System.out.println("El 2do continenente es: " + Continentes.EUROPA);
        System.out.println("El 2do continenente tiene: " + Continentes.EUROPA.getPaises() + " paises");
    }

    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
            System.out.println("Primer dia de la semana");
            break;
            case MARTES:
            System.out.println("Segundo dia de la semana");
            break;
            case MIERCOES:
            System.out.println("Tercer dia de la semana");
            break;
            case JUEVES:
            System.out.println("Cuarto dia de la semana");
            break;
            case VIERNES:
            System.out.println("Quinto dia de la semana");
            break;
            case SABADO:
            System.out.println("Sexto dia de la semana");
            break;
            case DOMINGO:
            System.out.println("Sextimo dia de la semana");
            break;
        }
    }
}
