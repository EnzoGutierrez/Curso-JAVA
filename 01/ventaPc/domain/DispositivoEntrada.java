package ventaPc.domain;

public class DispositivoEntrada {
    protected String tipoDeEntrada;
    protected String marca;

    public DispositivoEntrada(){
    }

    public DispositivoEntrada(String tipoDeEntrada, String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    public String getTipoDeEntrada(){
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada){
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[Tipo de entrada: ").append(tipoDeEntrada);
        sb.append(", nombre de marca: ").append(marca);
        sb.append("]");
        return sb.toString();
    }
}
