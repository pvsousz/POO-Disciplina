import java.util.Scanner;

public class Problema_3 {
    public static void main(String[] args) {
        //Variáveis
        Scanner scanner = new Scanner(System.in);
        int H,P,F,D;

        //Lógica
        // -1 = horário
        //  1 = anti-horário 
        //  Posições distintas ou seja não pode ser na mesma posição
        //  Posições válidas 0 a 15. Total de 16 posições

        System.out.println("Digite a posição do Helicoptero:");
        H = scanner.nextInt();
        System.out.println("Digite a posição do Policial:");
        P= scanner.nextInt();
        System.out.println("Digite a posição do Fugitivo:");
        F= scanner.nextInt();
        System.out.println("Horario(-1) Anti(1)");
        D = scanner.nextInt();

       
        scanner.close();

       while (true) {
        if (H < 0 || H > 15||  P < 0 || P > 15  || F < 0 || F > 15  
        || D != -1 && D != 1 || H == P || H==F || F==P ) {
            System.out.println("Posição inválida");
            break;  
       }
            if (D == 1) {
                if (F > P && P>H || H >P &&  F >P  || P > H && H >F) { 
                    System.out.println("S");
                    break;
                }else if (H> P &&  P > F || P > F && F > H ) {
                    System.out.println("N");
                    break;
                }
            }
            
            if (D == -1) {
                if (F > P && P>H || H >P &&  F >P || P > H && H >F) { 
                    System.out.println("N");
                    break;
                }else if (H> P &&  P > F || P > F && F > H ) {
                    System.out.println("S");
                    break;
                }
            }
       }
       

        

    }
}
