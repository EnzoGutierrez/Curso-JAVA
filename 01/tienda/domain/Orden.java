package tienda.domain;


public class Orden {
    protected int idOrden;
    protected Producto productos[];
    protected static int contadorOrdenes;
    protected int contadorProductos;
    protected static final int maxProductos = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.maxProductos];

    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.maxProductos){
            this.productos[this.contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el maximo de productos" + Orden.maxProductos);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: " + totalOrden);
        System.out.println("Productos de la orden: ");
        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}
