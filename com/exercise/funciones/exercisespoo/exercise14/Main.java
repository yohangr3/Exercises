package com.exercise.funciones.exercisespoo.exercise14;

public class Main {

    public static void main(String[] args) {

        Racional operations1 = new Racional(4,5);
        Racional operations2 = new Racional(7,6);


        System.out.println("La suma de los racionales " + operations1 + " + " + operations2 + " = " + operations1.suma(operations2));
        System.out.println("La resta de los racionales " + operations1 + " - " + operations2 + " = " + operations1.resta(operations2));
        System.out.println("La multiplicación de los racionales " + operations1 + " * " + operations2 + " = " + operations1.multiplicacion(operations2));
        System.out.println("La división de los racionales " + operations1 + " / " + operations2 + " = " + operations1.division(operations2));
    }
}
