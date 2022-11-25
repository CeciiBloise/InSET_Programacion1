package Programacion_I.TP3;

import java.util.Random;
import java.util.Scanner;

public class Ej10 {

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

        //Realizo la suma
        int suma=0;
        int fila_aleatorea;
        fila_aleatorea=aleatoreo.nextInt(4);

        for(int i=0; i<matriz.length; i++){
            if(i == fila_aleatorea){
                for(int j=0; j<matriz.length; j++){
                    suma+= matriz[i][j];
                }
            }
        }

        //Imprimo
        String imprimir = "";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                imprimir = imprimir + " " + matriz[i][j];
            }
            imprimir = imprimir + "\n";
        }
        System.out.println(imprimir);
        System.out.println("Se suman los elementos de la fila " +fila_aleatorea);
        System.out.println("Resultado: " +suma);
    }
}