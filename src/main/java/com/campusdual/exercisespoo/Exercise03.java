package com.campusdual.exercisespoo;

public class Exercise03 {

    public static String saludo(String nombre){

        String mensaje = "Hola, Bienvenido, " + nombre;
        return mensaje;

    }

    public static void fechaActual(String fecha){
        String mensaje = "La fecha actual es: " + fecha;
        System.out.println(mensaje);

    }

    public static void main(String[] args) {
        String mi_mensaje = saludo("santiago");
        System.out.println(mi_mensaje);
        fechaActual("19/10/2023");


    }
}
