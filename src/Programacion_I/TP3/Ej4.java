package Programacion_I.TP3;

public class Ej4 {
    public static void main(String[] args) {
        String[] nombre= {"M","A","R","I","A"};

        //Construyo el objeto Stringbuilder a partir del vector
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <nombre.length; i++) {
            stringBuilder.append(nombre[i]+ " ");
        }

        //Imprimo
        System.out.println("" + stringBuilder.toString());
    }
}
