package com.exercise.funciones.exercisespoo.exercise2;

public class Cuenta {

    String titular;
    double cantidad;

    public Cuenta(String titular) {
        this.titular = titular; //Sobrecarga
        this.cantidad = 0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    /*
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    */



    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
    }
}
