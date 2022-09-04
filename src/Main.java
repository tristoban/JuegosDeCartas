import Truco.Carta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opciones;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carta> mazo = new ArrayList<>();
        /*System.out.println("Que juego te gustaría probar?");
        System.out.println("Ingrese 1 para jugar Truco");
        opciones = scanner.nextInt();*/
        Carta.generarMazo(mazo); //Genero un mazo básico sin ochos y nueves
        Carta.valoresTruco(mazo); //Le aplico los valores del juego (truco y envido) a las cartas creadas
        for(int i=0;i<40;i++){
            System.out.println("Mazo generado y con valores añadidos");
            System.out.println(mazo.get(i));
        }
        Carta.mezclarMazo(mazo);
        System.out.println("Mazo mezclado listo para juego");
        for(int i=0;i<40;i++){
            System.out.println(mazo.get(i));
        }



    }
}
