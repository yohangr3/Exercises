package com.exercise.funciones.arrays;

public class exercise1 {

    public static void main(String[] args) {

        int matriz[][] = {{1,2,3,4},{5,6,7,8,9}};
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.println(matriz[i][j]);
            }

        }

        //Forma 2

        int matriz1[][]=new int[3][3];

        //i = filas y j = columnas
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){
                matriz1[i][j]=(i*matriz1.length)+(j+1);
                System.out.print(matriz1[i][j]+" ");

            }
            System.out.println("");
        }

    }
}
