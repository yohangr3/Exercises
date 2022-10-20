package com.exercise.funciones;

import java.util.Scanner;

public class Funciones1 {

    public static void main(String[] args) {

        Scanner elegirFigura = new Scanner (System.in);

        System.out.print("Ingrese el número de la figura a calcular : ");

        int figura = elegirFigura.nextInt();

        System.out.println();

        //Se seleccionará cuadrado
        if (figura == 1){

            System.out.println("Ha elegido hallar el área del cuadrado. \n");

            double lado1 = 10;
            double lado2 = 20;
            double areaCuadrado = getAreaCuadrado(lado1 , lado2);
            System.out.println("El área del cuadrado es : "  + areaCuadrado);


        }

        if(figura == 2){
            System.out.println("Ha elegido hallar el área del círculo. \n");

            double radio = 10;
            double pi = Math.PI;
            double areaCirculo = getAreaCirculo(radio , pi);
            System.out.println("El área del circulo es : "  + areaCirculo);
        }

        if(figura == 3){
            System.out.println("Ha elegido hallar el área del triángulo. \n");
            double base = 10;
            double altura = 20;
            double areaTriangulo = getAreaTriangulo(base, altura);
            System.out.println("El área del triangulo es : "  + areaTriangulo);
        }

        else{
            System.out.println("La opción elegida no existe. ");
        }

    }

    static double getAreaCuadrado(double lado1, double lado2) {
        return lado1 * lado2;
    }

    static double getAreaCirculo(double radio, double pi){
        return (Math.pow(radio,2)*pi);
    }

    static double getAreaTriangulo(double base, double altura){
        return ((base  * altura) / 2);
    }
}
