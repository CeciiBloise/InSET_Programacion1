package Programacion_I.Final;

//Defino la clase Ubicacion, para poder mover a los personajes
public class Ubicacion {

    //Defino los atributos x e y representan las coordenadas de ubicacion en el escenario del videojuego
    private int x;
    private int y;

    //Defino al constructor
    public Ubicacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Defino el metodo get que me devuelve el valor de x e y
    public int getX () {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    //Defino los metodos que me establece los valores de x e y correspondientes
    public void setUbicacion(int new_x, int new_y) {
        this.x= new_x;
        this.y = new_y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}