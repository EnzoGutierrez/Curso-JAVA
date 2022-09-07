package arreglos.test;
import arreglos.domain.*;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int [3][2];

        edades[0][0] = 5;
        edades[0][1] = 8;
        edades[1][0] = 2;
        edades[1][1] = 4;

        for(int i = 0; i < edades.length; i++){
            for (int j = 0; j < edades[i].length; j++){
                System.out.println("Edad " + i + "-" + j + ": " + edades[i][j]);
            }
        }

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Enzo");
        personas[1][0] = new Persona("Zeke");
        personas[1][1] = new Persona("Tefi");
        personas[0][2] = new Persona("Tifa");
        personas[1][2] = new Persona("Sofia");

        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Edad " + i + "-" + j + ": " + matriz[i][j]);
            }
        }
    }

}
