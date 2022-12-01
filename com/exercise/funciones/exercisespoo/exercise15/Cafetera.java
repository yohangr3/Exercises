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
    //Arreglar
    public double servirTaza(double cantidad){
        cantidad = cantidadActual - cantidad;
        return cantidad;
    }

    public double vaciarCafetera(){

        cantidadActual = 0;
        return cantidadActual;
    }
    //Arreglar este método , preguntar al toño
    public double agregarCafe(double cantidad){
        if(cantidad + cantidadActual <= capacidadMaxima) {
            cantidadActual += cantidad;
            return cantidad;
        }else{
            cantidad =capacidadMaxima -cantidadActual;
            cantidadActual = capacidadMaxima;
            return cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                '}';
    }
}

