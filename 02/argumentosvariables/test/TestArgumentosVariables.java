package argumentosvariables.test;

public class TestArgumentosVariables{
    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3);
        imprimirNumeros(4, 5, 6);
    }

    private static void imprimirNumeros(int... numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Numero #" + numeros[i]);
        }
    }
}