package com.exercise.funciones.exercisespoo;

public class SmartWatch extends SmartDevice{

    boolean sensorCardiaco;
    boolean sensorPasos;
    boolean resistenteAgua;

    public SmartWatch() {

    }

    public SmartWatch(double pantalla, double almacenamiento, int ram, String color, String modelo, String marca, boolean sensorCardiaco, boolean sensorPasos, boolean resistenteAgua) {
        super(pantalla, almacenamiento, ram, color, modelo, marca);
        this.sensorCardiaco = sensorCardiaco;
        this.sensorPasos = sensorPasos;
        this.resistenteAgua = resistenteAgua;
    }
}
