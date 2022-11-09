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

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //Aquí debe ir el método precio final
    @Override
    public double precioFinal() {
        super.precioFinal();
        if(resolucion > 40 && sintonizadorTDT == true) {
            precio_base = (precio_base * 0.30) + precio_base + 50;
        } else if (resolucion > 40 ) {
            precio_base = (precio_base * 0.30) + precio_base;
        }
        return precio_base;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precio_base=" + precio_base +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
