package com.exercise.funciones.exercisespoo.exercise3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Persona persona_1 = new Persona();
        Persona persona_2 = new Persona("Pilo", 25, 'M');
        Persona persona_3 = new Persona("Toño", 28, "65465617", 'M', 68, 1.72);
        System.out.print("Digite su nombre : \n");
        String nombre = lectura.next();
        System.out.print("Digite su edad : \n");
        int edad = lectura.nextInt();
        System.out.print("Digite su sexo (H/M) : \n");
        String sexo = lectura.next();
        System.out.print("Digite su peso en kg : \n");
        double peso = lectura.nextDouble();
        System.out.print("Digite su altura en metros : \n");
        double altura = lectura.nextDouble();
        persona_1.setNombre(nombre);
        persona_1.setEdad(edad);
        //persona_1.setSexo(sexo);
        persona_1.setPeso(peso);
        persona_1.setAltura(altura);


        persona_1.calcularIMC();
        persona_2.calcularIMC();
        persona_3.calcularIMC();
        persona_1.esMayorDeEdad();
        persona_2.esMayorDeEdad();
        persona_3.esMayorDeEdad();
        persona_3.generarDNI();
        System.out.println(persona_1);
        System.out.println(persona_2);
        System.out.println(persona_3);






    }
}
