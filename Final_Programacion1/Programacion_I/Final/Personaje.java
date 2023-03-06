//Define el paquete de la clase
package Programacion_I.Final;

public abstract class Personaje {

    //Defino los atributos
    protected String nombre;
    protected int puntos_vida;
    protected Ubicacion ubicacion;

    //Defino los metodos
    //Defino metodos abstractos
    public abstract void hablar();
    public abstract void correr();

    //Defino el metodo preentarse, que imprime la informacion
    public void presentarse() {
        System.out.println("\nHola, mi nombre es " + this.nombre);
        System.out.println("Tengo " + this.puntos_vida + " puntos de vida");
        System.out.println("Estoy ubicado en la posición (" + this.ubicacion.getX() + ", " + this.ubicacion.getY() + ")");
    }

    //Defino el metodo mover, que cambia la ubicación del personaje a una nueva ubicación
    public void mover() {
        int new_x = ubicacion.getX() + 1;
        int new_y = ubicacion.getY() + 1;
        this.ubicacion.setUbicacion(new_x, new_y);
    }

    //Defino el metodo verificar_vida, que verifica si el personaje aún tiene puntos de vida restantes
    public void verificar_vida() {
        if (this.puntos_vida <= 0) {
            System.out.println(this.nombre + "murio");
        }
        else {
            System.out.println(this.nombre + "sigue con vida");
        }
    }

    //Defino el metodo restarPuntos_vida, que resta un punto de vida al personaje
    public void restarPuntos_vida() {
        this.puntos_vida = this.puntos_vida - 1;
    }
}