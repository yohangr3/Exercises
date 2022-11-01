package com.exercise.funciones.exercisespoo.exercise2;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta("yohan");
        Cuenta cuenta_2 = new Cuenta("Estiven", 100);

        //Ingresamos el dinero
        cuenta_1.ingresar(200);
        cuenta_2.ingresar(200);

        //Retiramos dinero
        cuenta_1.retirar(50);
        cuenta_2.retirar(100);

        System.out.println(cuenta_1);
        System.out.println(cuenta_2);

    }
}
