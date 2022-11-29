package com.exercise.funciones.exercisespoo.exercise14;

import com.exercise.funciones.exercisespoo.exercise13.Complejo;

import java.util.Scanner;

public class Racional {
    double numerador;
    double denominador;


    public Racional() {
    }

    public Racional(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;

    }


    public void leer() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite el numerador de la primera fracción : ");
        numerador = lectura.nextDouble();
        System.out.println("Digite el denominador de la primera fracción: ");
        denominador = lectura.nextDouble();
    }

    // recortar ** otro.complejo** para realizar la operación de los fraccionarios
    public Racional suma(Racional otro) {
        return new Racional((numerador * otro.denominador) + (denominador * otro.numerador), denominador * otro.denominador);
    }

    public Racional resta(Racional otro) {
        return new Racional((numerador * otro.denominador) - (denominador * otro.numerador), denominador * otro.denominador);
    }

    public Racional multiplicacion(Racional otro) {
        return new Racional(numerador * otro.numerador, denominador * otro.denominador);
    }

    public Racional division(Racional otro) {

        return new Racional((numerador * otro.denominador) , denominador * otro.numerador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
