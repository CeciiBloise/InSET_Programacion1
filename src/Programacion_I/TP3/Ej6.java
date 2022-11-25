package Programacion_I.TP3;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        //Declaracion
        int[] vector= new int[5];

        //Asignacion
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 5 numero:");
        for(int i = 0; i<vector.length; i++){
            System.out.println("Ingrese el N°" + i + ":");
            vector[i]=teclado.nextInt();
        }
        //Suma
        int suma=0;
        for(int i=0; i<vector.length; i++){
            suma+=vector[i];
        }

        //Imprimo
        System.out.println("La suma es: " +suma);
    }
}
