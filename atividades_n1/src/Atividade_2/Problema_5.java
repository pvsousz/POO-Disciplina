package Atividade_2;

import java.util.Scanner;

public class Problema_5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o salário da Maria:");
    double salario_maria = scanner.nextDouble();
    double salario_joao = salario_maria/3;
    scanner.close();
    
    double poupanca = salario_maria;
    double renda_fixa = salario_joao;
    
    int meses = 0;
    while (poupanca>=renda_fixa) {
        poupanca = poupanca *1.01;
        renda_fixa = renda_fixa *1.03;
        meses = meses +1;
    }

    System.out.println("Meses:" + meses);
    System.out.printf("Maria:%.2f\n", poupanca);
    System.out.printf("João:%.2f\n", renda_fixa);
    
    
    
    }
    
}