package com.exercise.funciones.exercisespoo.exercise18;

public class Rueda {

    int libras =0;

    public String RuedaInflada (int libras){

        if(libras >= 30 && libras <= 38){
            return "La rueda esta inflada";
        } else if (libras > 38) {
            return "Rueda muy inflada";
        }else {
            return "Rueda desinflada";
        }
    }
}
