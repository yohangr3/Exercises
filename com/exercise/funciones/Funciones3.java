package com.exercise.funciones;

import java.util.Scanner;

public class Funciones3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n = leer.nextInt();
        int contador = 0;
        for(int i = 1;i<=n;i++) {
            //double division = n/i;
            if(n % i == 0 ){

                System.out.println(i);
            }
        }
    }
}
