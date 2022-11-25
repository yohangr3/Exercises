package com.exercise.funciones.exercisespoo.exercise12;

import java.util.Scanner;

public class Cuenta {

    private String persona;
    private double cantidad;

    public Cuenta() {
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("Bienvenido: " + persona + "\n su saldo es : " + cantidad);
    }

    public void ingresar(double cantidad){
        if(cantidad > 0) {
            cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0){
            cantidad -= cantidad;
        }

    }
}
