package com.exercise.funciones.exercisespoo.exercise5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class precioelec {

    public static void main(String[] args) {


        Scanner lectura = new Scanner(System.in);

        double precio =0 ;

        System.out.println("Ingrese el tamaño: ");
        double tamano = lectura.nextDouble();

        System.out.println("Ingrese el caracter: ");
        char letra = lectura.next().charAt(0);


        if (letra == 'A' ){
            precio = 100;
        } else if (letra == 'B') {
            precio = 80;
        } else if (letra == 'C') {
            precio = 60;
        } else if (letra == 'D') {
            precio = 50;
        } else if (letra == 'E') {
            precio = 30;
        } else if (letra == 'F') {
            precio = 10;
        }

        double precioTamano=0;
        if (tamano >= 0 && tamano <= 19){
            precioTamano = 10;
        } else if (tamano >= 20 && tamano <=49) {
            precioTamano = 50;
        } else if (tamano >= 50 && tamano <= 79) {
            precioTamano = 80;
        } else if (tamano >= 80) {
            precioTamano = 100;
        }

        precio = precio + precioTamano;

        System.out.println("El precio del electrodomestico : " + precio);
    }
}
