package ventaPc.domain;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        this.idTeclado = ++contadorTeclado;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ID del teclado: ").append(idTeclado);
        sb.append(" Tipo de entrada: ").append(tipoDeEntrada);
        sb.append(", nombre de marca: ").append(marca);
        sb.append("]");
        return sb.toString();
    }
}
