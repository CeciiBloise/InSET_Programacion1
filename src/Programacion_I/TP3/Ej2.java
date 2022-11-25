package Programacion_I.TP3;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) throws Exception {
        //Declaracion
        int[] vector = new int[10];

        //Asignacion por teclado
        System.out.println("Ingrese 10 numeros enteros:");
        Scanner teclado = new Scanner(System.in);
            for(int i = 0; i<vector.length ; i++){
                System.out.println("Un numero para la posicion " + i);
                vector[i]=teclado.nextInt();
            }

        //Recorrer y contar cuantos numeros 5 hay
        int contador =0;

        for(int i = 0; i<vector.length ; i++){
            if(vector[i] == 5){
                contador=contador+1;
            }
        }
        //Imprimo
        System.out.println("La cantidad de 5 ingresados es de: " + contador);
    }

}
