package com.exercise.funciones.arrays;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {

        Scanner sn=new Scanner(System.in);



        int matriz[][]=new int[4][4];
        int[] diagonal = new int[matriz.length];
        int[] diagonalSecuandaria = new int[matriz.length];



        //Ingresamos los valores de la matriz
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){

                System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1");
                matriz[i][j]=sn.nextInt();


            }
        }

        System.out.println("Ingrese el número de la fila que desea sumar");
        int fila = sn.nextInt();

        while (fila < 1 && fila > 4 ){
            System.out.println("Ingrese el número de la fila que desea sumar");
            fila = sn.nextInt();
        }
        // Ya hay fila valida
        int sumaFilas = 0;
        for(int j=0;j<matriz[0].length;j++){
            sumaFilas += matriz[fila - 1][j];
        }
        System.out.println("La suma de las filas es : " + sumaFilas);

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
        System.out.println("La suma de las columnas es : " +sumaColumnas);


        for(int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagonal[i] = matriz[i][j];
                }
                if(i+j == matriz.length-1){
                    diagonalSecuandaria[i] = matriz[i][j];
                }
            }
        }

        int suma =0;
        for(int i=0;i<diagonal.length;i++) {
            suma += diagonal[i];
        }
        System.out.println("La suma de la diagonal principal es : "+ suma );

        int sumaSecuandaria = 0;
        for(int i=0;i<diagonalSecuandaria.length;i++) {
            sumaSecuandaria += diagonalSecuandaria[i];
        }
        System.out.println("La suma de la diagonal secundaria es : " + sumaSecuandaria );
        System.out.println();

        double sumaMatriz = 0;
        double media = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++) {
                sumaMatriz += matriz[i][j];
            }

        }
        media = sumaMatriz/(matriz.length*matriz.length);
        System.out.println(sumaMatriz + "-----" + media);
        System.out.println();

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
