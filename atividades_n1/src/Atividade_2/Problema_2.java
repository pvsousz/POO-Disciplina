package Atividade_2;
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal_avista = 0;
        double valorTotal_prazo = 0;

        for (int i = 0; i < 15; i++) {
            
            System.out.println("Digite o código:");
            String code = scanner.nextLine();

            if (code.equalsIgnoreCase("v")) {
                System.out.println("Digite o valor da transação:");
                double valor = scanner.nextDouble();
                valorTotal_avista = valorTotal_avista + valor;
                scanner.nextLine();
            }

            if (code.equalsIgnoreCase("p")) {
                System.out.println("Digite o valor da transação:");
                double valor = scanner.nextDouble();
                valorTotal_prazo = valorTotal_prazo + valor;
                scanner.nextLine();
            }
        }
        scanner.close();


            System.out.printf("Valor total:R$%.2f\n" , valorTotal_avista);
            System.out.printf("Valor total:R$%.2f\n", valorTotal_prazo);
            System.out.printf("Valor total das compras efetuadas:R$%.2f\n" ,(valorTotal_prazo + valorTotal_avista));
            System.out.printf("Valor primeira prestação a prazo:R$%.2f\n" , (valorTotal_prazo/3));
    }
}
