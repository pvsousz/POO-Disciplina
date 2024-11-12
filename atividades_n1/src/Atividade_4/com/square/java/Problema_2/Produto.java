package com.square.java.Problema_2;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public Produto() {
       
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        if (precoVenda>= precoCusto) {
            this.precoVenda = precoVenda;    
        }else{
            System.out.println("Preço venda é menor que o preço de custo");
        }
    } 

    public String calcularMargemLucroPorcentagem(double custo , double venda){
        double porcentagem = 0;
        if (venda>= custo) {
            double lucro = venda - custo;
            porcentagem = (lucro/custo)*100;
            
            return porcentagem + "% Margem de lucro positiva" ;
        }else if (venda< custo) {
            double lucro = venda - custo;
            porcentagem = (lucro/custo)*100;
              
        }
        return porcentagem +"% Margem de lucro negativa";
    }    
    
    
    
    
    public double getMargemLucro() {
        return margemLucro;
    }
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
    
}
