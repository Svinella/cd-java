package com.campusdual.exercisespoo;

public class Exercise07 {
    //Mostrar los primeros 15 numeros naturales
    //Sumar los primeros 100 numeros naturales

    public static void printNumbers (int num) {
        for (int i = 0; i < num; i++) {
            System.out.print((i+1) +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(3);
        printNumbers(5);

        System.out.println(sumNumbers(100));
        System.out.println(sumNumbers(67));
        System.out.println(sumNumbers(5));



        }
        public static int sumNumbers(int num){
int sum = 0;
for (int i = 1; i<= num; i++){
    sum += i;
}
return sum;
        }


    }
