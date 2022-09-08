package ventaPc.domain;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static int contadorOrdenes;
    protected static final int maxComputadoras = 10;
    
    public Orden(){
        idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.maxComputadoras){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se ha superado el maximo de computadoras" + Orden.maxComputadoras);
        }
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Productos de la orden: ");
        for(int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }
    }
}
