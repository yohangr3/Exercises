package com.exercise.funciones.exercisespoo.exercise8;

public class Raices {

    double a;
    double b;
    double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices(){
        double x1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        double x2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);

        System.out.println("Solucion X1");
        System.out.println(x1);
        System.out.println("Solucion X2");
        System.out.println(x2);
    }

    public void obtenerRaiz(){

        double x=(-b)/(2*a);

        System.out.println("Unica solucion");
        System.out.println(x);

    }

    //El discriminante es la parte de la ecuación de segundo grado (b2 - 4*a*c)
    public double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }

    //Si el discriminante es mayor que 0 tiene dos soluciones
    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    //Si el discriminante es igual a 0 tiene una solución
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }

    public void calcular(){

        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones");
        }

    }
}
