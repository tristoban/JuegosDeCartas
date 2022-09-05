import Truco.Carta;
import Truco.Jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carta> mazo = new ArrayList<>();
        ArrayList<Carta> mesa1 = new ArrayList<>();
        ArrayList<Carta> mesa2 = new ArrayList<>();
        System.out.println("Sale una partida de Truco");
        System.out.println("Generando mazo, dando valores y mezclando...");
        Carta.generarMazo(mazo); //Genero un mazo básico sin ochos y nueves
        Carta.valoresTruco(mazo); //Le aplico los valores del juego (truco y envido) a las cartas creadas
        /*for(int i=0;i<40;i++){
            //System.out.println(mazo.get(i));
        }*/
        Carta.mezclarMazo(mazo);
        /*for(int i=0;i<40;i++){
            System.out.println(mazo.get(i));
        }*/
        //inicializamos jugadores
        System.out.println("Ingrese nombre jugador 1");
        nombre= scanner.nextLine();
        Jugador jugador1 = new Jugador(nombre,0,0,0);
        System.out.println("Ingrese nombre jugador 2");
        nombre= scanner.nextLine();
        Jugador jugador2 = new Jugador(nombre,0,0,0);

        //repartimos la primera mano

        //cartas en mesa para el jugador1
        int pos = 0;
        for(int i=0; i<=2;i++){
            mesa1.add(pos,mazo.get(i));
            pos++;
        }
        jugador1.setMano(mesa1);
        //cartas en mesa para el jugador2
        pos = 0;
        for(int i=2; i<=4;i++){
            mesa2.add(pos,mazo.get(i));
            pos++;
        }
        jugador2.setMano(mesa2);

        //mostramos cartas jugador 1
        System.out.println(jugador1.getNombre()+", tus cartas son:");
        System.out.println(jugador1.getMano());

        //mostramos cartas jugador 2
        System.out.println(jugador2.getNombre()+", tus cartas son:");
        System.out.println(jugador2.getMano());


    }
}
