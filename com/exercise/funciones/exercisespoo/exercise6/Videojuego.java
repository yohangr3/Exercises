package com.exercise.funciones.exercisespoo.exercise6;

public class Videojuego {

    String titulo;
    double horasEstimadas = 10;
    boolean entregado = false;
    char genero;
    String compania;

    public Videojuego() {
    }

    public Videojuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, double horasEstimadas, char genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero=" + genero +
                ", compania='" + compania + '\'' +
                '}';
    }
}
