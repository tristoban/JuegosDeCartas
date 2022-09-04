package Truco;

import java.util.ArrayList;
import java.util.List;

public class Carta {
    private int valor;
    private String palo;
    private int truco;
    private int envido;

    public Carta(int valor, String palo, int truco, int envido) {
        this.valor = valor;
        this.palo = palo;
        this.truco = truco;
        this.envido = envido;
    }

    public static void generarMazo(ArrayList mazo) {
        System.out.println("Generando una buena baraja de cartas sin ochos y nueves");
        for(int c=0; c<=40;c++){
            //Cartas espada
            for (int i = 1; i <= 7; i++) {
                System.out.println(i);
                new Carta(i, "espada", 0, 0);
                System.out.println(mazo.get(i));
            }
            for (int i = 10; i <= 12; i++) {
                new Carta(i, "espada", 0, 0);
                System.out.println(mazo.get(i));
            }
            //Cartas basto
            for (int i = 1; i <= 7; i++) {
                new Carta(i, "basto", 0, 0);
                System.out.println(mazo.get(i));
            }
            for (int i = 10; i <= 12; i++) {
                new Carta(i, "basto", 0, 0);
                System.out.println(mazo.get(i));
            }
            //Cartas oro
            for (int i = 1; i <= 7; i++) {
                new Carta(i, "oro", 0, 0);
                System.out.println(mazo.get(i));
            }
            for (int i = 10; i <= 12; i++) {
                new Carta(i, "oro", 0, 0);
                System.out.println(mazo.get(i));
            }
            //Cartas copa
            for (int i = 1; i <= 7; i++) {
                new Carta(i, "copa", 0, 0);
                System.out.println(mazo.get(i));
            }
            for (int i = 10; i <= 12; i++) {
                new Carta(i, "copa", 0, 0);
                System.out.println(mazo.get(i));
            }
        }
    }

    public static void valoresTruco(List<Carta> mazo) {
        for (int i = 1; i <= 40; i++) {
            Carta carta = mazo.get(i);
            if (carta.valor == 1 && carta.palo == "espada") {
                carta.setTruco(14);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 1 && carta.palo == "basto") {
                carta.setTruco(13);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 7 && carta.palo == "espada") {
                carta.setTruco(12);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 7 && carta.palo == "oro") {
                carta.setTruco(11);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 3) {
                carta.setTruco(10);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 2) {
                carta.setTruco(9);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 1 && carta.palo == "copa" || carta.palo == "oro") {
                carta.setTruco(8);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 12) {
                carta.setTruco(7);
                mazo.set(i,carta);
            }
            else if (carta.valor == 11) {
                carta.setTruco(6);
                mazo.set(i,carta);
            }
            else if (carta.valor == 10) {
                carta.setTruco(5);
                mazo.set(i,carta);
            }
            else if (carta.valor == 7 && carta.palo == "basto" || carta.palo == "copa") {
                carta.setTruco(4);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 6) {
                carta.setTruco(3);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 5) {
                carta.setTruco(2);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
            else if (carta.valor == 4) {
                carta.setTruco(1);
                carta.setEnvido(i);
                mazo.set(i,carta);
            }
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getTruco() {
        return truco;
    }

    public void setTruco(int truco) {
        this.truco = truco;
    }

    public int getEnvido() {
        return envido;
    }

    public void setEnvido(int envido) {
        this.envido = envido;
    }
}

