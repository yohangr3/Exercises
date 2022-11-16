package com.exercise.funciones.exercisespoo.exercise9;

public class Asiento {

    char letra;
    int fila;
    Espectador espectador; // Será la información del espectador

    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = null; // Inicia así ya que no hay nadie sentado aún

    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public boolean ocupado() {
        return espectador != null;
    }
    @Override
    public String toString() {
        if (ocupado()) {
            return "Asiento: " + fila + letra + " y " + espectador; //Si ocupado es true
        }

        return "Asiento: " + fila + letra + " y este asiento está vacio ";

    }

}
