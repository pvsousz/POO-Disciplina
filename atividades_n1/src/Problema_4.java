import java.util.Scanner;

public class Problema_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d,pontuacao=0;

        System.out.println("Distância do lançamento:");
        d = scanner.nextInt();
        scanner.close();

        if (d<2000) {
            if (d<=800) {
                pontuacao = 1;
                System.out.println(pontuacao);
            }else if (d<=1400) {
                pontuacao = 2;
                System.out.println(pontuacao);
                
            }else {
                pontuacao = 3;
                System.out.println(pontuacao);
            }
            
        }else{
            System.out.println("Vai jogar de fora da quadra?");
        }
        
    }
}
