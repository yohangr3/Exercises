package com.exercise.funciones.exercisespoo.exercise13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el número real");
        double real = lectura.nextDouble();
        System.out.println("Ingrese el número imaginario");
        double imaginario = lectura.nextDouble();
        Complejo complejo = new Complejo(real, imaginario);
        System.out.println("Ingrese el número real");
        real = lectura.nextDouble();
        System.out.println("Ingrese el número imaginario");
        imaginario = lectura.nextDouble();

        Complejo complejo2 = new Complejo(real, imaginario);


        Complejo suma1 = complejo.suma(complejo2);
        //System.out.println(suma1);
        Complejo resta1 = complejo.resta(complejo2);
        //System.out.println(resta1);
        Complejo mul1 = complejo.multiplicacion(complejo2);
        //System.out.println(mul1);
        Complejo div1 = complejo.division(complejo2);
        System.out.println(div1);


        //  Complejo resta1 = complejo.resta(complejo2);

    }
}
