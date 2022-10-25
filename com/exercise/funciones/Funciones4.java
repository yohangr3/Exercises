package com.exercise.funciones;

import java.util.Scanner;

public class Funciones4 {

    public static void main(String[] args) {

        Scanner lectura= new Scanner (System.in);

        System.out.print("Ingrese un número: ");

        int n = lectura.nextInt();

        System.out.println();


        int factorial = 1;

        for(int i = n ; i > 1 ; i--){
            factorial = factorial * i;
            System.out.println("Factorial " + factorial);
        }
    }
}
