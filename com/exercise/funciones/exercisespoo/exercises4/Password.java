package com.exercise.funciones.exercisespoo.exercises4;

import java.security.SecureRandom;

public class Password {

    private int longitud = 8;
    private String contrasenaa;

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenaa() {
        return contrasenaa;
    }

    public void setContrasenaa(String contrasenaa) {
        this.contrasenaa = contrasenaa;
    }

    public Password() {  //Constructor por defecto
        longitud = 8;
        generarPassword();
    }


    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte(String contrasena){

        boolean esfuerte = true;
        //if(contrasena.length() >  )

        return esfuerte;
    }


    public String generarPassword() {

        char[] mayusculas ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] minusculas ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] numeros ={'0','1','2','3','4','5','6','7','8','9'};

        //Creamos un StringBuilder que sería un String con todos los caracteres mayuculas, minusculas y numeros
        StringBuilder caracteres = new StringBuilder();

        //Concatenamos las listas a una lista caracteres
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);

        //Creamos un objeto de tipo StringBuilder que será un string y esa será la contraseña
        StringBuilder contrasena = new StringBuilder();

        for(int i = 0 ; i<8 ; i++){
            int cantidadcarcateres = caracteres.length();
            int numeroRandom =(int)(Math.random()*cantidadcarcateres);

            contrasena.append((caracteres.toString()).charAt(numeroRandom));
        }
        return contrasena.toString();

    }
}
