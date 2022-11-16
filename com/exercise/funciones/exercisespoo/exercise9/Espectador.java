package com.exercise.funciones.exercisespoo.exercise9;

public class Espectador {

    String nombre;
    int edad ;
    double dineroEspectador ;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dineroEspectador) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroEspectador = dineroEspectador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroEspectador() {
        return dineroEspectador;
    }

    public void setDineroEspectador(double dineroEspectador) {
        this.dineroEspectador = dineroEspectador;

    }

    public void pagar(double precio){
        dineroEspectador -= precio;

    }

    public boolean tieneDinero(double precioEntrada){
        return dineroEspectador >= precioEntrada;
    }

    public boolean tieneEdad(int edadMinima){
        return edad >= edadMinima;
    }

    @Override
    public String toString(){
        return "El nombre del espectador es " + nombre + " de " + edad + " años y con " + dineroEspectador + " euros en su bolsillo";
    }


}
