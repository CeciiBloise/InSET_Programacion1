package Programacion_I.TP3;

import java.util.Random;

public class Ej9 {
    public static void main(String[] args) {
        //Defino
        Random aleatoreo = new Random();
        int[][] matriz = new int [4][4];

        //Asigno numero aleatoreos
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                matriz[i][j]= aleatoreo.nextInt(100); //numeros aleatoreos comprendidos entre 0 y 100
            }
        }

        //Imprimo
        String imprimir = "";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                imprimir = imprimir + "|" + matriz[i][j];
            }
            imprimir = imprimir + "|\n";
        }
        System.out.println(imprimir);
    }
}
