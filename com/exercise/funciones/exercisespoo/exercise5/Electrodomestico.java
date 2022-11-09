package com.exercise.funciones.exercisespoo.exercise5;

import java.util.Scanner;

public class Electrodomestico {

    double precio_base = 100;
    String color = "blanco";
    char consumoEnergetico = 'F';
    double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(double precio_base, String color, char consumoEnergetico, double peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void consumoEnergetico() {

    }

    public String comprobarColor() {
        return "";
    }

    public double precioFinal(){


        if (consumoEnergetico == 'A' ){
            precio_base += 100;
        } else if (consumoEnergetico == 'B') {
            precio_base += 80;
        } else if (consumoEnergetico == 'C') {
            precio_base += 60;
        } else if (consumoEnergetico == 'D') {
            precio_base += 50;
        } else if (consumoEnergetico == 'E') {
            precio_base += 30;
        } else if (consumoEnergetico == 'F') {
            precio_base += 10;
        }


        if (peso >= 0 && peso <= 19){
            precio_base += 10;
        } else if (peso >= 20 && peso <=49) {
            precio_base += 50;
        } else if (peso >= 50 && peso <= 79) {
            precio_base += 80;
        } else if (peso >= 80) {
            precio_base += 100;
        }

        return precio_base;
    }

}
