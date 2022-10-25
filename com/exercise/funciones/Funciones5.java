package com.exercise.funciones;

import java.util.Scanner;

public class Funciones5 {

    public static void main(String[] args) {

        Scanner lectura= new Scanner (System.in);

        System.out.print("Ingrese un número: ");

        int n = lectura.nextInt();

        System.out.println();

        int divisor = 2;

        int contador = 0;

        for(int i = 0; i <=n; i++) {

            int r = n / divisor;

            contador = r;

            System.out.print(r + " ");


        }





    }
}
