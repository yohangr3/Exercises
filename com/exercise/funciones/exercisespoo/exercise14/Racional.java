package com.exercise.funciones.exercisespoo.exercise14;

import java.util.Scanner;

public class Racional {
    double numerador;
    double denominador;

    double numerador1;
    double denominador1;
    public Racional() {
    }

    public Racional(double numerador, double denominador, double numerador1, double denominador1) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
    }

    public void leer(){
        Scanner lectura= new Scanner (System.in);
        System.out.println("Digite el numerador de la primera fracción : ");
        numerador= lectura.nextDouble();
        System.out.println("Digite el denominador de la primera fracción: ");
        denominador= lectura.nextDouble();
        System.out.println("Digite el numerador de la segunda fracción : ");
        numerador1= lectura.nextDouble();
        System.out.println("Digite el denominador de la segunda fracción: ");
        denominador1= lectura.nextDouble();

    }

    public double suma(double numerador,double denominador ,double numerador1 ,double denominador1){

        double suma = ((numerador * denominador1) + (denominador * numerador1))/(denominador*denominador1);
        return suma;
    }
    public double resta(double numerador,double denominador ,double numerador1 ,double denominador1){

        double resta = ((numerador * denominador1) - (denominador * numerador1))/(denominador*denominador1);
        return resta;
    }

    public double multiplicacion(double numerador,double denominador ,double numerador1 ,double denominador1){

        double multiplicacion = ((numerador * denominador1))/((denominador*denominador1));
        return multiplicacion;
    }
    public double division(double numerador,double denominador ,double numerador1 ,double denominador1) {

        double division = ((numerador * denominador1))/((denominador*numerador));
        return division;
    }

    @Override
    public String toString() {
        return "Racional{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                ", numerador1=" + numerador1 +
                ", denominador1=" + denominador1 +
                '}';
    }
}
