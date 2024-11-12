package com.square.java.Problema_1;

public class Circulo {
    private double raio;

    
    public void aumentarRaio(double valor){
        this.setRaio(getRaio()*(valor/10)*100) ; 
    }

    public double getCircunferencial(){
        double circunferencia = (2*Math.PI)*raio;
        return circunferencia;
    }
    
    public double getArea(){
        double area_circulo = Math.PI*Math.pow(raio, raio);
        return area_circulo;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    

}
