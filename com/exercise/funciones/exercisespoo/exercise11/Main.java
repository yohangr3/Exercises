package com.exercise.funciones.exercisespoo.exercise11;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setNombre("Yohan");
        persona1.setEdad(26);
        persona1.setDni(1018483898);

        persona1.mostrar();
        persona1.esMayorDeEdad();

        System.out.println(persona1.mostrar());
        System.out.println(persona1.esMayorDeEdad());
        persona1.mostrarDatos();
    }
}
