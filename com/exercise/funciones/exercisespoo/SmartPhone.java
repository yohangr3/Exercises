package com.exercise.funciones.exercisespoo;

public class SmartPhone extends SmartDevice{

    boolean camara ;
    boolean radio;

    public SmartPhone() {
    }

    public SmartPhone(double pantalla, double almacenamiento, int ram, String color, String modelo, String marca, boolean camara, boolean radio) {
        super(pantalla, almacenamiento, ram, color, modelo, marca);
        this.camara = camara;
        this.radio = radio;
    }
}
