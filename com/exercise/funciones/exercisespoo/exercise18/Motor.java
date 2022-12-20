package com.exercise.funciones.exercisespoo.exercise18;

/**. Crea las siguientes clases (cada una en su archivo):
  Motor: con métodos para arrancar el motor y apagarlo.
  Rueda: con métodos para inflar la rueda y desinflarla.
  Ventana: con métodos para abrirla y cerrarla.
  Puerta: con una ventana y métodos para abrir la puerta y cerrar la puerta.
 Ingeniería Técnica Informática de Sistemas
 Programación Orientada a Objetos Ejercicios Clases y Objetos — Pág. 4
  Coche: con un motor, cuatro ruedas y dos puertas;
 con los métodos que te parezcan adecuados  **/
public class Motor {

    boolean encendido = false;

    public Boolean Encender(Boolean encendido){
        if(encendido == true){
            return true;
        }else{
            return false;
        }
    }
}
