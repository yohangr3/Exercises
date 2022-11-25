package com.exercise.funciones.exercisespoo.exercise11;

public class Persona {

    private String nombre;
    private int edad;
    private
    int dni;

    public Persona() {
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public String mostrar() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                '}';
    }

    public boolean esMayorDeEdad(){
        if(edad >= 0 && edad < 18){
            return false;
        }else {
            return true;
        }
    }

    public void mostrarDatos() {
        System.out.println("Mi nombre es: " + nombre + " tengo " +edad + " con número dni " + dni);
    }
}
