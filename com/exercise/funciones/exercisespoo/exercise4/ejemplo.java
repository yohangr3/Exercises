package com.exercise.funciones.exercisespoo.exercise4;

public class ejemplo {

    public static void main(String[] args) {

        String cadena = "jhasdk2123";
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            }
        }
        System.out.println("numeros : " + n);
        System.out.println(n.length());
    }
}
