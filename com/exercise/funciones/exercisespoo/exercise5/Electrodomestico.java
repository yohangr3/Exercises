package com.exercise.funciones.exercisespoo.exercise5;

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

    public void precioFinal(){
        precio_base = consumoEnergetico + peso;

    }

}
