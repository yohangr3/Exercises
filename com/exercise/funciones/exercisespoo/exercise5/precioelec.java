package com.exercise.funciones.exercisespoo.exercise5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class precioelec {

    public static void main(String[] args) {

        double precio_base = 100;
        String color = "blanco";
        char consumoEnergetico = 'F';
        double peso = 5;

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





        System.out.println("El precio del electrodomestico : " + precio_base);

        lavadora lavadora1 = new lavadora();
        Television televisor1 = new Television();
        televisor1.precioFinal();
        televisor1.precioFinal();
        lavadora1.precioFinal();
        System.out.println(televisor1);
        System.out.println(lavadora1);
    }
}
