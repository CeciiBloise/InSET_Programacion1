package Programacion_I.TP3;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws Exception {

        //Declaracion
        int[] vector1 = new int[10];
        String[] vector2 = new String[10];

        //Asignacion por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primero un numero y luego una palabra:");
            for(int i = 0; i<vector1.length ; i++){
                System.out.println("Para la posicion " + i+ ": ");

                vector1[i]=teclado.nextInt();
                vector2[i]=teclado.nextLine();

            }

        //Imprimo
        for(int i = 0; i<vector1.length ; i++){
            System.out.println("-----------------------------------------");
            System.out.println("Estoy en la posicion " + i);
            System.out.println("Tengo guardado un " + vector1[i] + " y " + vector2[i] );
        }
    }
}

