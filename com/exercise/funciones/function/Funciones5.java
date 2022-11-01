package com.exercise.funciones.function;

import java.util.Scanner;

public class Funciones5 {

    public static void main(String[] args) {

        Scanner lectura= new Scanner (System.in);

        System.out.print("Ingrese un número: ");

        int n = lectura.nextInt();

        System.out.println();

        int contador=0;
        for (int i=n;i>0;i/=2) {
            int residuo = n%i;
            residuo = contador;
            contador++;
            System.out.println(contador);

        }





    }
}
