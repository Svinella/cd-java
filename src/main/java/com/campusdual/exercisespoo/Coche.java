package com.campusdual.exercisespoo;

public class Coche {

    public String marca;
    public String modelo;
    public int velocidadMaxima;
    public String combustible;
    public int velocidad = 0;
    public int revoluciones = 0;

    public Coche (String marca, String modelo, int velocidadMaxima, String combustible, int velocidad, int revoluciones){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.combustible = combustible;
    }
    public void arrancar(){
        this.revoluciones = 1000;

    }
    public void apagar (){
        this.revoluciones = 0;
    }

    public int acelerar (){
    this.velocidad = this.velocidad +10;
    return this.velocidad;
    }

    public int frenar () {
    this.velocidad = this.velocidad -10;
    return this.velocidad;
    }

    public void girarVolante(int grados){
        if (grados<0){
            System.out.println("Giro a la izquierda");
        }else (grados>0){
            System.out.println("Giro a la derecha");
        }

    }








}
