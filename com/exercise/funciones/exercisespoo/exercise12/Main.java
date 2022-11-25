package com.exercise.funciones.exercisespoo.exercise12;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();

        cuenta1.setPersona("Yohan");
        cuenta1.setCantidad(2000);

        cuenta1.mostrar();
        cuenta1.ingresar(2000);

        cuenta1.getCantidad();

        cuenta1.retirar(1000);

        cuenta1.getCantidad();
    }
}
