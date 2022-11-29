package com.exercise.funciones.exercisespoo.exercise15;

public class Cafetera {

    double capacidadMaxima;
    double cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double cA, double cM) {
        this.capacidadMaxima = cM;
        if (cA > cM) {
            this.cantidadActual = cM;
        } else {
            this.cantidadActual = cA;
        }


    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenaCafetera(){
        cantidadActual = capacidadMaxima;
    }

    public double servirTaza(double cantidad){
        if(cantidadActual < cantidad){
            cantidad = cantidadActual;
        }else {
            cantidad = cantidad;
        }
        return cantidadActual;
    }

    public void vaciarCafetera(){
        cantidadActual = 0;
    }

    public double agregarCafe(double cantidad){
        cantidadActual += cantidad;
        return cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                '}';
    }
}

