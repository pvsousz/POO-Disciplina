package problema_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        ContaCorrente c3 = new ContaCorrente();

        System.out.println("Escolha a conta desejada:");
        System.out.println("'1' Conta");
        System.out.println("'2' Conta");
        System.out.println("'3' Conta");
        int numeroconta = scanner.nextInt();
        scanner.nextLine();
        
        if (numeroconta == 1) {
            System.out.println("Digite o nome:");
            c1.setNome(scanner.nextLine());
            System.out.println("Digite o número da agência:");
            c1.setAgencia(scanner.nextLine());
            c1.setConta("001923");
            System.out.println("Valor do desposito desejado:");
            c1.depositar(scanner.nextDouble());
            System.out.println(c1.getSaldo());
        }else if(numeroconta == 2){
            System.out.println("Digite o nome:");
            c2.setNome(scanner.nextLine());
            System.out.println("Digite o número da agência:");
            c2.setAgencia(scanner.nextLine());
            c2.setConta("001923");
            System.out.println("Valor do desposito desejado:");
            c2.depositar(scanner.nextDouble());
            System.out.println(c1.getSaldo());
        }else if (numeroconta == 3) {
            System.out.println("Digite o nome:");
            c3.setNome(scanner.nextLine());
            System.out.println("Digite o número da agência:");
            c3.setAgencia(scanner.nextLine());
            c3.setConta("001923");
            System.out.println("Valor do desposito desejado:");
            c3.depositar(scanner.nextDouble());
            System.out.println(c1.getSaldo());
        }
        scanner.close();

        c2.setNome("João Pero");
        c2.setAgencia("001-5");
        c2.setConta("00184");

        c3.setNome("Helena Shin");
        c3.setAgencia("001-9");
        c3.setConta("001923");

        
        c1.transferir(c2, 2.0);
        System.out.println(c2.getSaldo());
        System.out.println(c1.getSaldo());

        c1.transferir(c3, 8.0);
        c2.transferir(c3, 3.0);
        

        c1.toString();


        
        

        
    }
}
