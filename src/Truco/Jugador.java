package Truco;

import java.util.ArrayList;


public class Jugador {
    private String nombre;
    private int puntajeTotal;
    private int puntajeRonda;
    private int puntajeEnvido;

    ArrayList<Carta> mano = new ArrayList<>();

    public Jugador(String nombre, int puntajeTotal, int puntajeRonda, int puntajeEnvido) {
        this.nombre = nombre;
        this.puntajeTotal = puntajeTotal;
        this.puntajeRonda = puntajeRonda;
        this.puntajeEnvido = puntajeEnvido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public int getPuntajeRonda() {
        return puntajeRonda;
    }

    public void setPuntajeRonda(int puntajeRonda) {
        this.puntajeRonda = puntajeRonda;
    }

    public int getPuntajeEnvido() {
        return puntajeEnvido;
    }

    public void setPuntajeEnvido(int puntajeEnvido) {
        this.puntajeEnvido = puntajeEnvido;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }
}


