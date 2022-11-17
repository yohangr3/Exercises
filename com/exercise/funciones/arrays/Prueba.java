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

        System.out.println("Ingrese el número de la fila que desea sumar");
        int fila = sn.nextInt();

        while (fila < 1 && fila > 2 ){
            System.out.println("Ingrese el número de la fila que desea sumar");
            fila = sn.nextInt();
        }
        // Ya hay fila valida
        int suma = 0;
        for(int j=0;j<matriz[0].length;j++){
            suma += matriz[fila - 1][j];
        }
        System.out.println(suma);

        System.out.println("Ingrese el número de la columna que desea sumar");
        int columna = sn.nextInt();

        while (columna < 1 && columna > 4 ){
            System.out.println("Ingrese el número de la fila que desea sumar");
            columna = sn.nextInt();
        }

        int sumaColumnas = 0;
        for(int i=0;i<matriz.length;i++){
            sumaColumnas += matriz[i][columna-1];
        }
        System.out.println(sumaColumnas);


        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
