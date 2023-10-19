package com.campusdual.exercisespoo;

public class Exercise02 {

    public static void main(String[] args) {
        //Área de un círulo = PI * r * r
        //Longitud de una circunferencia = PI * 2 * r
        //Área de un cuadrado: lado * lado

        double r = 7;
        double pi = Math.PI;

        System.out.print("Área del círculo: ");
        System.out.println(pi * Math.pow(7,2));

        System.out.print("Longitud de una circunferencia: ");
        System.out.println(pi * 2 * r);

        double lado = 5;

        System.out.print("área de un cuadrado: ");
        System.out.println(Math.pow(lado,2));
    }
}
