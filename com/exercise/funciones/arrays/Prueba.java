package com.exercise.funciones.arrays;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Scanner sn=new Scanner(System.in);



        int matriz[][]=new int[2][2];



        //Ingresamos los valores de la matriz
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){

                System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1");
                matriz[i][j]=sn.nextInt();


            }
        }





    }
}
