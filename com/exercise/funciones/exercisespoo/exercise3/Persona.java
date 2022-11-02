package com.exercise.funciones.exercisespoo.exercise3;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
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

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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
        if(edad < 0){
            System.out.println("Error de edad");
            if( edad < 18){
                System.out.println("Es menor de edad");
            }else{
                System.out.println("Es mayor de edad");
            }
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

    public String generarDNI(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0,"T");
        map.put(1,"R");
        map.put(2,"W");
        map.put(3,"A");
        map.put(4,"G");
        map.put(5,"M");
        map.put(6,"Y");
        map.put(7,"F");
        map.put(8,"P");
        map.put(9,"D");
        map.put(10,"X");
        map.put(11,"B");
        map.put(12,"N");
        map.put(13,"J");
        map.put(14,"Z");
        map.put(15,"S");
        map.put(16,"Q");
        map.put(17,"V");
        map.put(18,"H");
        map.put(19,"L");
        map.put(20,"C");
        map.put(21,"K");
        map.put(22,"E");

        String dni = "";
        for (int i = 1; i <= 8; i++) {
            int numero = (int) (Math.random() * 8);
            dni += (numero);
        }
        int x = Integer.parseInt(dni);

        System.out.println(x);
        int y  = x%23;

        String z = map.get(y) + x;
        System.out.println(z);

        return z;
    }



}
