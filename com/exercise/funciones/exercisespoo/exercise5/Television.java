package com.exercise.funciones.exercisespoo.exercise5;

public class Television extends Electrodomestico{

    double resolucion = 20;
    boolean sintonizadorTDT  = false;

    public Television() {
    }

    public Television(double precio_base, double peso) {
        super(precio_base, peso);
    }

    public Television(double precio_base, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precio_base, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
