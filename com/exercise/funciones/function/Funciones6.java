package com.exercise.funciones.function;

import java.util.Scanner;

public class Funciones6 {

    public static void main(String[] args) {

        Scanner lectura= new Scanner (System.in);

        System.out.print("Ingrese un número: ");

        int n = lectura.nextInt();

        System.out.println();

        //String str = String.valueOf(n);

        //System.out.println(str.length());

        int contador=0;
        for (int i=n;i>0;i/=10) {
            //Incrementamos el contador
            contador++;



        }
        System.out.println(contador);
    }
}
