package com.campusdual.exercisespoo;

public class Exercise05 {
    // Comprobar si un número es positivo o negativo.
    // Comprobar si un número es múltiplo de otro.
    // Comprobar si un número es menor que otro.

    public static void main(String[] args) {
        System.out.print("Comprobar si un numero es positivo o negativo: ");
        esPositivo( 0);
        System.out.print("Comprobar si un numero es multiplo de otro: ");
        esMultiplo(4,5);
        System.out.print("Comprobar si un numero es menor que otro: ");
        esMayor(4,5);

    }

    public static void esPositivo(int numero){
        if (numero>=0) {
             System.out.println("Es positivo");
    } else {
            System.out.println("Es negativo");
        }
    }
    public static void esMultiplo(int numero1, int numero2){
        if (numero1 % numero2 == 0) {
            System.out.println("El número "+numero1+ "es un múltiplo de "+numero2);
    } else {
            System.out.println("El número "+ numero1+ "no es un múltiplo de " +numero2);
        }

    }
public static void esMayor(int n,int n2 ){
        if (n < n2){
            System.out.println("Es mayor");
        }
        else if (n > n2){
            System.out.println("Es menor");
        }else{
            System.out.println("Es igual");
        }

}


    }