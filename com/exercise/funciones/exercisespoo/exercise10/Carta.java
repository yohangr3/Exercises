package com.exercise.funciones.exercisespoo.exercise10;

public class Carta {

    int numero;
    String palo;

    String[] palos = {"espadas" , "oros","copas","bastos"};
    int numCartas = 12;

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo;
    }
}
