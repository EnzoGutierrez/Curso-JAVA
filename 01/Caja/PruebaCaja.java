package Caja;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3, 2, 6);
        int volumen = caja1.CalcularVolumen();
        System.out.println("El volumen es de: " + volumen);
    }
    
}
