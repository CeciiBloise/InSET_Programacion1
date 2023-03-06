package Programacion_I.Final;

//Defino la clase Villano que se extiende de la clase madre Personaje
public class Villano extends Personaje{
    private int fuerza;
    private int velocidad;

    //Defino constructor
    public Villano(String nombre, int velocidad, Ubicacion ubicacion, int fuerza){
        this.nombre = nombre;
        this.puntos_vida = 100;
        this.velocidad = velocidad;
        this.ubicacion = ubicacion;
        this.fuerza = fuerza;
    }

    //Defino los metodos
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Mi fuerza es: " + this.fuerza);
        System.out.println("Mi velocidad es: " + this.velocidad);
    }

    @Override
    public void hablar() {
        System.out.println("¡Voy a secuestrar al principe! MUAJAJAJA");
    }

    @Override
    public void correr() {
        int new_x = velocidad+ubicacion.getX();
        int new_y = velocidad+ubicacion.getY();
        this.ubicacion.setUbicacion(new_x, new_y);
    }

    //En el metodo atacar tomo como parametro al objeto heroe
    public void atacar(Heroe heroe) {
        for(int i = 1; i <= this.fuerza; i = i + 1) {
            heroe.restarPuntos_vida();
        }
    }

    public void curar() {
        this.puntos_vida += 5;
        if (this.puntos_vida > 100) {
            this.puntos_vida = 100;
        }
    }
}
