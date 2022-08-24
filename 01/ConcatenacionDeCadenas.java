public class ConcatenacionDeCadenas {
    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println(union);

        var i = 10;
        var j = 20;

        System.out.println(i + j);
        System.out.println(union + i + j);
        System.out.println(union + (i + j));
    }
    
}
