package Atividade_2;

public class Problema_1 {
    public static void main(String[] args) {
        // Definindo as variáveis iniciais
        double precoInicial = 5.00;
        int vendasIniciais = 120;
        double despesas = 200.00;
        double decrementoPreco = 0.50;
        int aumentoVendas = 26;

    
        System.out.printf("%-10s %-20s %-25s %-15s%n", "Preço", "Ingressos Vendidos", "Lucro Esperado", "Lucro");
        System.out.println("--------------------------------------------------------------");

       
        for (double precoAtual = precoInicial; precoAtual >= 1.00; precoAtual -= decrementoPreco) {
            
            int ingressosVendidos = vendasIniciais + (int)((precoInicial - precoAtual) / decrementoPreco * aumentoVendas);

            double receita = precoAtual * ingressosVendidos;
            double lucro = receita - despesas;

            System.out.printf("%-10.2f %-20d %-25.2f %-15.2f%n", precoAtual, ingressosVendidos, receita, lucro);
        }
    }
}
