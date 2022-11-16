package com.exercise.funciones.arrays;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {

        Scanner lectura= new Scanner (System.in);
        System.out.println("Ingrese el número de columnas : ");
        int columnas = lectura.nextInt();

        int matriz[][]=new int[5][columnas];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]=(generaNumAleatorio(0,9));
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println("");
        }
    }
    public static int generaNumAleatorio(int minimo,int maximo){

        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

    }
}
