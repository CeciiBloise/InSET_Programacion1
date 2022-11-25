package Programacion_I.TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) throws Exception {
        //Declaracion
        String[] vector = {"Estoy","cursando","el","segundo","año","de","mi","carrera"};

        //Construyo el objeto Stringbuilder a partir del vector
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <vector.length; i++) {
            stringBuilder.append(vector[i]+ " ");
        }

        //Imprimo
        System.out.println(" " + stringBuilder.toString());
    }
}
