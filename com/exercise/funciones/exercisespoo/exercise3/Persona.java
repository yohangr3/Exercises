package com.exercise.funciones.exercisespoo.exercise3;
import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private char sexo = 'H'; //(H hombre , M mujer)
    private double peso; // Peso en kg
    private double altura; // Altua en metros

    //Constructor por defecto
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Métodos

    public double calcularIMC(){

        double imc = peso/(Math.pow(altura,2));

        if(imc < 20){
            imc = -1;
            System.out.println(imc);
        } else if (imc >= 20 && imc <= 25) {
            imc = 0;
            System.out.println(imc + " ----Esta por debajo de su peso ideal----");
        }else if (imc > 25){
            imc = 1;
            System.out.println(imc + " ----Tiene sobrepeso---- ");
        }
        return imc;
    }

    public double esMayorDeEdad(){
        if(edad >= 0 && edad <= 18){
            System.out.println("Es menor de edad");
        }else{
            System.out.println("Es mayor de edad");
        }

        return edad;
    }

    public char comprobarSexo(char sexo){

        if(sexo != 'H' && sexo != 'M'){
            sexo = 'H';
        }

        return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int generarDNI(){
        Random random = new Random();
        int numero = (int) (Math.random()*8+0);
        char letraDNI = (char) (random.nextInt(26) + 'a');
        dni = numero+letraDNI;
        System.out.println(dni);
        return dni;

    }


}
