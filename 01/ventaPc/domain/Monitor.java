package ventaPc.domain;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    public Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamaño){
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor(){
        return idMonitor;
    }

    public double getTamaño(){
        return tamaño;
    }

    public void setTamaño(Double tamaño){
        this.tamaño = tamaño;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ID del monitor: ").append(idMonitor);
        sb.append(" tamaño del monitor: ").append(tamaño);
        sb.append(", nombre de marca: ").append(marca);
        sb.append("]");
        return sb.toString();
    }
}
