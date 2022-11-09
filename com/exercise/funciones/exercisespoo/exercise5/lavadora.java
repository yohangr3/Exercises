package com.exercise.funciones.exercisespoo.exercise5;

public class lavadora extends Electrodomestico{

    double carga = 5;

    public lavadora(){

    }

    public lavadora(double precio_base, double peso) {
        super(precio_base, peso);

    }

    public lavadora(double precio_base, String color, char consumoEnergetico, double peso, double carga) {
        super(precio_base, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    //Acá debe ir el método preciofinal

}
