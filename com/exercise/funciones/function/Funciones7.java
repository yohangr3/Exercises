package com.exercise.funciones.function;

import java.util.Scanner;

public class Funciones7 {

    public static void main(String[] args) {

        Scanner lectura= new Scanner (System.in);


        System.out.print("Ingrese un la cantidad de dinero que desea convertir en euros: ");

        double n = Double.parseDouble(lectura.nextLine());

        System.out.println();


        System.out.println("Seleccione el tipo de moneda de cambio : ");

        String monedaCambio = lectura.nextLine();

        double cantidadConvertida = 0;

        double dolar = 1;

        double yen = 7.28;

        double libraEsterlina = 0.78;

        if(monedaCambio.equals("dolar") ){
            cantidadConvertida = n * dolar;
            System.out.println(n + "euros son " + cantidadConvertida + "dolares" );
        } else if (monedaCambio.equals("yen")) {
            cantidadConvertida = n * yen;
            System.out.println(n + "euros son " + cantidadConvertida + "yenes");
        } else if (monedaCambio.equals("libraEsterlina")) {
            cantidadConvertida = n * libraEsterlina;
            System.out.println(n + "euros son " + cantidadConvertida + "libras");
        }else{
            System.out.println("Error");
        }


    }
}
