package com.exercise.funciones.exercisespoo.exercise17;

import java.util.Scanner;

public class Date {

    int day;
    int month;
    int year;

    public Date() {
        day = 1;
        month = 1;
        year = 1900;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        valida();
    }

    public void Read(){
        Scanner sb= new Scanner (System.in);
        System.out.println("Ingrese un día del 1 al 31 : ");
        day = sb.nextInt();
        System.out.println("Ingrese un mes del 1 al 12 : ");
        month = sb.nextInt();
        System.out.println("Ingrese un año desde 1900 hasta 2050 : ");
        year = sb.nextInt();
        valida();
    }

    public boolean Bisiesto(){

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            return true;
        }else {
            return false;
        }

    }

    public int diasMes(int month, int year) {

        if(month ==1 || month ==3 || month == 5 || month ==7|| month ==8|| month ==10 || month ==12){
            day = 31;
        } else if (month ==4 || month ==6 || month ==9 || month ==11) {
            day =11;
        } else if (month == 2){
            day = 28;
        } else if (Bisiesto() == true && month ==2) {
            day = 29;
        }
        return day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void valida(){
        if(day < 1 || day > 31){
            day = 1;

        } else if (month <1 || month >12) {
            month =1;

        }else if (year < 1900 || year >2050){
            year = 1900;

        }

    }

    public String corta() {
        return day + " - " + month +" - " + year;
    }

    //Revisar
    public int diasTranscurridos(){
        return 0;
    }

    public String diaSemana(){
        return "";
    }
    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
