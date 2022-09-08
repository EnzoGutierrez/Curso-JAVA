package ventaPc.domain;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRaton;

    public Raton(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        this.idRaton = ++contadorRaton;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ID del teclado: ").append(idRaton);
        sb.append(" Tipo de entrada: ").append(tipoDeEntrada);
        sb.append(", nombre de marca: ").append(marca);
        sb.append("]");
        return sb.toString();
    }
}
