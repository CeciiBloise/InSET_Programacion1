//Importacion de las clase
import Programacion_I.Final.Heroe;
import Programacion_I.Final.Ubicacion;
import Programacion_I.Final.Victima;
import Programacion_I.Final.Villano;

//Clase principal
public class Main {
    public static void main(String[] args){
        // Creo la instancia ubicacion para representar la ubicacion del personaje en el escenario del videojuego
        Ubicacion ubicacionHeroe = new Ubicacion(0, 0);
        //Creo la instancia heroe
        //                     (nombre, veocidad, ubicacion inicial,fuerza )
        Heroe heroe = new Heroe("Osa Polar", 5, ubicacionHeroe, 10);

        // Creo instancia de Villano
        Ubicacion ubicacionVillano = new Ubicacion(4, 4);
        Villano villano = new Villano("Dr. Hielo", 10, ubicacionVillano, 5);

        // Creo instancia de Victima
        Ubicacion ubicacionVictima = new Ubicacion(5, 5);
        Victima victima = new Victima("Principe Pinguino", 100, ubicacionVictima);

        // Llamo al metodo presentarse y hablar de cada instancia y se imprime por pantalla
        heroe.presentarse();
        heroe.hablar();
        villano.presentarse();
        villano.hablar();
        victima.presentarse();
        victima.hablar();
    }
}