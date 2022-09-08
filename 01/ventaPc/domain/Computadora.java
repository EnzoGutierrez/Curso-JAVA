package ventaPc.domain;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    public Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora(){
        return idComputadora;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public Monitor getMonitor(){
        return monitor;
    }

    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }

    public Teclado getTeclado(){
        return teclado;
    }

    public void setRaton(Raton raton){
        this.raton = raton;
    }

    public Raton getRaton(){
        return raton;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ID de la computadora: ").append(idComputadora);
        sb.append(", nombre de la computadora: ").append(nombre);
        sb.append(", monitor ").append(monitor);
        sb.append(", teclado ").append(teclado);
        sb.append(", raton ").append(raton);
        sb.append("]");
        return sb.toString();
    }
}
