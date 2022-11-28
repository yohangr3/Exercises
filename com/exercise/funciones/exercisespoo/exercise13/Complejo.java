package com.exercise.funciones.exercisespoo.exercise13;

import java.util.Scanner;

public class Complejo {

    public double real;
    public double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo suma(Complejo otro) {
        double sumaReal = (real + otro.real);
        double sumaImaginaria = (imaginario + otro.imaginario);
        return new Complejo(sumaReal, sumaImaginaria);
    }

    public Complejo resta(Complejo otro) {
        double restaReal = (real - otro.real);
        double restaImaginaria = (imaginario - otro.imaginario);
        return new Complejo(restaReal, restaImaginaria);
    }

    public Complejo multiplicacion(Complejo otro) {
        double mulReal = (real * otro.real) - (imaginario*otro.imaginario);
        double mulImaginaria = (real* otro.imaginario) + (imaginario* otro.real);
        return new Complejo(mulReal, mulImaginaria);

    }

    public Complejo division(Complejo otro) {
        double numerador1 = ((real* otro.real)+(imaginario*otro.imaginario)) ;
        double numerador2 = ((imaginario* otro.real)-(real*otro.imaginario));
        double denominador = Math.pow(otro.real,2) + Math.pow(otro.imaginario, 2);
        return new Complejo(numerador1, denominador);

    }

    @Override
    public String toString() {
        return real + " + " + imaginario + 'i';
    }
}
