package com.exercise.funciones.exercisespoo.exercise5;

public class Main {
    public static void main(String[] args) {
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];

        listaElectrodomesticos[0]=new Electrodomestico(200, "Verde", 'C', 60);
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Television(500, "negro", 'E',80 , 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600, "gris", 'D',20 );
        listaElectrodomesticos[5]=new Lavadora(300, "blanco", 'Z', 40, 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, "verde", 'A', 100, 15);
        listaElectrodomesticos[8]=new Television(200, "naranja", 'C',60 , 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(50, 10);
    }
}
