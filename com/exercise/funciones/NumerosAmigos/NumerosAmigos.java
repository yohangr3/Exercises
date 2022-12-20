package com.exercise.funciones.NumerosAmigos;

public class NumerosAmigos {
    public static void main(String[] args) {
        int suma =0;
        int num1 =220;
        int num2 =284;

        for(int i=1; i<num1; i++){
            if(num1%i==0){
                suma+=i;
                //System.out.println(i);
            }
        }
        if(suma == num2){
            suma=0;
        }
            for(int i=1; i<num2; i++){
                if(num2%i==0){
                    suma+=i;
                    //System.out.println(i);
                }
            }
        if(suma == num1){
            System.out.println("Los numero 1 " + num1 + " y el numero 2 " + num2 + " Son amigos");
        }else {
            System.out.println("Los numero 1 " + num1 + " y el numero 2 " + num2 + " No son amigos");
        }
    }
}
