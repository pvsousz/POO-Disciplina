package Atividade_2;
import java.util.Scanner;


public class Problema_4 {
    public static double calcularPorcentagem(int candidato, double total_votos){
        double porcentagem = (candidato/total_votos) *100;

        return porcentagem;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao =10;

        int c1 =0;
        int c2 =0;
        int c3 =0;
        int c4 =0;
        int v_nulos =0;
        int v_brancos =0;
        double total_votos =0;

               
        
        while (opcao!= 0) {

            System.out.println("Digite um número:");
            System.out.println("1.Candidato '1'");
            System.out.println("2.Candidato '2'");
            System.out.println("3.Candidato '3'");
            System.out.println("4.Candidato '4'");
            System.out.println("5.Nulo");
            System.out.println("6.Branco");
            System.out.println("0.Sair");
            opcao = scanner.nextInt(); 
            
            switch (opcao) {
                case 1:
                    c1 = c1 +1;
                    System.out.println("Voto candidato '1' confirmado! ");
                    
                    
                    break;
                case 2:
                    c2 = c2 +1;
                    System.out.println("Voto candidato '2' confirmado! ");
                    
                    break;
                case 3:
                    c3 = c3 +1;
                    System.out.println("Voto candidato '3' confirmado! ");
                    
                    break;
                case 4:
                    c4 = c4 +1;
                    System.out.println("Voto candidato '4' confirmado! ");
                    
                    break;
                case 5:
                    v_nulos = v_nulos +1;
                    System.out.println("Voto nulo confirmado! ");
                    
                    break;
                case 6:
                    v_brancos = v_brancos +1;
                    System.out.println("Voto em branco confirmado! ");
                    
                    break;
                case 0:
                    System.out.println("Saindo...");

                    break;
                default:
                    System.out.println("CÓDIGO INVÁLIDO");
                    break;
            }
        }
        scanner.close();
        
        total_votos = c1+c2+c3+c4+v_brancos+v_nulos;

        System.out.println("Total de votos:" + total_votos);
        System.out.println("Votos candidato '1':"+ c1 +". Sua porcentagem é:"  + String.format("%.2f", calcularPorcentagem(c1,total_votos)) +"%");
        System.out.println("Votos candidato '2':"+ c2 +". Sua porcentagem é:"  + String.format("%.2f", calcularPorcentagem(c2, total_votos)) +"%");
        System.out.println("Votos candidato '3':"+ c3 +". Sua porcentagem é:"  + String.format("%.2f", calcularPorcentagem(c3, total_votos)) +"%");
        System.out.println("Votos candidato '4':"+ c4 +". Sua porcentagem é:"  + String.format("%.2f", calcularPorcentagem(c4, total_votos)) +"%");
        System.out.println("Votos nulos:"+ v_nulos +". Sua porcentagem é:"  + String.format("%.2f", calcularPorcentagem(v_nulos, total_votos)) +"%");
        System.out.println("Votos em branco:"+ v_brancos +". Sua porcentagem é:"  + String.format("%.2f", calcularPorcentagem(v_brancos, total_votos)) +"%");

        
        //System.out.println("Porcentagem votos nulos e brancos:"+ nulos_brancos_porcentagem);
        
        

    }  
}
