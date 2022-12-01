package com.exercise.funciones.exercisespoo.exercise16;

import java.util.Scanner;

public class Nif {

    private int dni;
    private char letra;

    public Nif() {
    }

    public Nif(int dni) {
        this.dni = dni;
        letra = calcularLetra();
    }

    public char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[dni % 23];
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dni: ");
        dni = sc.nextInt();
        letra = calcularLetra();
    }
    @Override
    public String toString() {
        return "00"+dni + " - " + letra ;
    }
}
