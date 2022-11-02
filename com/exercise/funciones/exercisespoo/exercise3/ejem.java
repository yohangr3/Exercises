package com.exercise.funciones.exercisespoo.exercise3;

import java.util.HashMap;
import java.util.Map;

public class ejem {

    public static void main(String[] args) {

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


        /*for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }*/
        String dni = "";
        for (int i = 1; i <= 8; i++) {
            int numero = (int) (Math.random() * 8);
            dni += (numero);
        }
        int x = Integer.parseInt(dni);

        System.out.println(x);
        int y  = x%23;

        System.out.println(map.get(y) + x);
    }
}
