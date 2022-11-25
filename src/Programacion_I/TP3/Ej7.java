package Programacion_I.TP3;

import java.util.Vector;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        //Declaracion
        Vector<Integer> vector = new Vector<>();
        //int[] vector = new int[5];

        //Asignacion
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 5 numero:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el N°" + i + ":");
            vector.add(teclado.nextInt());
        }

        //Imprimo
        System.out.print("El vector es:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(" " + vector.get(i));
        }
        System.out.println();

        System.out.print("Ingrese el elemnto que desea agregar en la posicion 2: ");
        int nuevo_num = teclado.nextInt();
        //Elimino elemento de la posicion 2
        vector.add(2, nuevo_num);
        vector.remove(3);

        //imprimo
        System.out.print("El vector es:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(" " + vector.get(i));
        }
        System.out.println();

    }
}