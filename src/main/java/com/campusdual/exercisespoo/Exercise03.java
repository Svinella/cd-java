package com.campusdual.exercisespoo;

public class Exercise03 {

    public static String saludo(String nombre){

        String mensaje = "Hola, Bienvenido, " + nombre;
        return mensaje;

    }

    public static void main(String[] args) {
        System.out.println(saludo("santiago"));
        

    }
}
