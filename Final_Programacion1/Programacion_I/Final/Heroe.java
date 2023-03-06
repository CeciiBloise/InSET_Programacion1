//Paquete de la clase
package Programacion_I.Final;

//Defino la clase Heroe que extiende de la clase Personaje
public class Heroe extends Personaje {
    //Defino los atributos
    //Atributos especifico de heroe
    private int fuerza;
    private int velocidad;

    //Defino constructor, que le paso como parametros los atributos  que hereda de la clase madre y los especificos.
    public Heroe(String nombre, int velocidad, Ubicacion ubicacion, int fuerza) {
        this.nombre = nombre;
        this.puntos_vida = 100;
        this.ubicacion = ubicacion;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
    }

    //Defino los metodos
    //Defino un metodo presentarse
    @Override
    public void presentarse() {
        super.presentarse(); // llamo primero al metodo presentarse de la clase madre
        System.out.println("Mi fuerza es: " + this.fuerza);//imprime la informacion
        System.out.println("Mi velocidad es: " + this.velocidad);
    }

    //Los metodos hablar y correr, tambien se extienden de la clase madre
    @Override
    public void hablar() {

        System.out.println("¡Rescatare al Príncipe Pingüino!");
    }

    @Override
    public void correr() {
        int new_x = velocidad + 2*ubicacion.getX();//actualizo su ubicacion acuerdo con su velocidad
        int new_y = velocidad + 2*ubicacion.getY();
        this.ubicacion.setUbicacion(new_x, new_y);
    }

    //Defino el metodo atacar, en este metodo tomo como parametro al objeto villano
    public void atacar(Villano villano) {
        for (int i = 1; i <= this.fuerza; i = i + 1) {
            villano.restarPuntos_vida(); //resto los puntos de vida del villano en funcion de la fuerza del heroe
        }
    }

    //Defino el metodo curar
    public void curar() {
        this.puntos_vida += 10; //incremento los puntos de vida
        if (this.puntos_vida > 100) {
            this.puntos_vida = 100;
        }
    }
}