package com.exercise.funciones.exercisespoo.exercise7;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setAutor("Mario Mendoza");
        libro1.setIsbn(123456789);
        libro1.setTitulo("Satanas");
        libro1.setNumeroPaginas(350);

        libro2.setAutor("Mario Mendoza");
        libro2.setIsbn(987654321);
        libro2.setTitulo("buda blue");
        libro2.setNumeroPaginas(100);


        if(libro1.getNumeroPaginas() > libro2.getNumeroPaginas()){
            System.out.println("El libro 1 tiene más páginas que el libro 2");
        }else {
            System.out.println("El libro 2 tiene más páginas que el libro 1");
        }

        System.out.println(libro1);
        System.out.println(libro2);


    }
}
