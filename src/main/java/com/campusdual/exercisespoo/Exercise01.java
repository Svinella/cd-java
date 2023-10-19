package com.campusdual.exercisespoo;

import java.sql.SQLOutput;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.printf("Hello,World");
        String cnv = "200";
        int cnvInt = Integer.parseInt(cnv);
        cnv = cnv + 1;
        cnvInt= cnvInt + 1;
        String cnvSrt = String.valueOf(cnvInt);
        System.out.println(cnvSrt.charAt(2));


        int i= 1;
        String iStr = String.valueOf("i")
        Double iDouble = Double.valueOf(iStr);
        String iDstr = String.valueOf(iDouble);
        System.out.println(Boolean.valueOf("true"));


    }
}
