package Programacion_I.TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) throws Exception {

        //Declaracion
        int numero[] = new int[15];
        int suma_positivos = 0, suma_negativos = 0;
        int contador_positivos = 0, contador_negativos = 0;

        //Asignacion por teclado
        System.out.println("Ingrese 15 numeros enteros:");
        Scanner teclado = new Scanner(System.in);
            for (int i = 0; i < numero.length; i++) {
                System.out.println("Ingrese un numero: ");
                numero[i] = teclado.nextInt();

                if (numero[i] > 0) {
                    suma_positivos += numero[i];
                    contador_positivos++;
                } else {
                    suma_negativos += numero[i];
                    contador_negativos++;
                }
            }
            System.out.println("Cantidad de numeros positivos: " + contador_positivos);
            System.out.println("Cantidad de numeros negativos: " + contador_negativos);
        }
}