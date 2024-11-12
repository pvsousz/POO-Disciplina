package com.square.java.Problema_1;
public class Main {
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(3);

        System.out.println(String.format("Área:%.2f", c1.getArea()));
        System.out.println(String.format("Circunferência:%.2f", c1.getCircunferencial()));
        
        System.out.println(String.format("Raio:%.2f", c1.getRaio()));
        c1.aumentarRaio(3);
        

        
    }
    
}
