package com.exercise.funciones.exercisespoo.exercise5;

public class Lavadora extends Electrodomestico{

    double carga = 5;

    public Lavadora(){

    }

    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);

    }

    public Lavadora(double precio_base, String color, char consumoEnergetico, double peso, double carga) {
        super(precio_base, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    //Acá debe ir el método preciofinal
    @Override
    public double precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio_base += 50;
        }
        return precio_base;
    }

    @Override
    public String toString() {
        return "lavadora{" +
                "carga=" + carga +
                ", precio_base=" + precio_base +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
