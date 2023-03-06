package Programacion_I.Final;

//Defino la clase Victima que se extiende de la clase madre Personaje
public class Victima extends Personaje {

    //Defino el constructor
    public Victima(String nombre, int puntos_vida, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.puntos_vida = 100;
        this.ubicacion = ubicacion;
    }

    //Defino los metodos
    @Override
    public void hablar() {

        System.out.println("¡AYUDAAAA!");
    }

    @Override
    public void correr() {
        int new_x = ubicacion.getX();
        int new_y = ubicacion.getY();
        this.ubicacion.setUbicacion(new_x, new_y);
    }
}
