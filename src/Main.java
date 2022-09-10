import Truco.Carta;
import Truco.Jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre; //nombre jugador
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carta> mazo = new ArrayList<>();
        ArrayList<Carta> mesa1 = new ArrayList<>();
        ArrayList<Carta> mesa2 = new ArrayList<>();
        System.out.println("Sale una partida de Truco");
        System.out.println("Generando mazo, dando valores y mezclando...");
        Carta.generarMazo(mazo); //Genero un mazo básico sin ochos y nueves
        Carta.valoresTruco(mazo); //Le aplico los valores del juego (truco y envido) a las cartas creadas
        /*for(int i=0;i<40;i++){
            System.out.println(mazo.get(i));
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

        for(int i=0; i<=2;i++){
            mesa1.add(mazo.get(i));
            //mesa1.add(pos,mazo.get(i));

        }
        jugador1.setMano(mesa1); //seteamos la mano

        //cartas en mesa para el jugador2

        for(int i=3; i<=5;i++){
            mesa2.add(mazo.get(i));
        }
        jugador2.setMano(mesa2);

        //mostramos cartas jugador 1
        System.out.println(jugador1.getNombre()+", tus cartas son:");

        jugador1.mostrarMisCartas();
        //mostramos cartas jugador 2
        System.out.println(jugador2.getNombre()+", tus cartas son:");
        jugador2.mostrarMisCartas();

        boolean juego = true; // seteamos un booleano que tenga como condicionamiento el puntaje menor a 30 en cualquiera de los jugadores
        int hand = 0; //seteamos quien es mano

        //Arrancamos el juego
        while(juego==true){
            if (hand%2==0){




            } else {



            }
            if(jugador1.getPuntajeTotal()>=30 || jugador2.getPuntajeTotal()>=30){
                juego = false;
            }
            hand++; //con esto rotamos el jugador "mano"
        }





    }
}
