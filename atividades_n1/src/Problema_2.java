import java.util.Scanner;

public class Problema_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor_compra;
        double compra_parcelada;
        double numero_parcelas;

        System.out.println("Insira o valor da compra:");
        valor_compra = scanner.nextDouble();
        System.out.println("Insira o número de parcelas:");
        numero_parcelas = scanner.nextDouble();
        scanner.close();


        compra_parcelada =  valor_compra/numero_parcelas;
        int nova_parcela = (int)compra_parcelada;

        if (valor_compra%numero_parcelas!=0 ) {
            double resto = valor_compra%numero_parcelas;
            
            for (int i = 0 +1; i < numero_parcelas+1 ; i++) {
                if (resto>0) {
                    System.out.println("Parcelas:" + i + "  Valor:"+ (nova_parcela +1));
                }else{
                    System.out.println("Parcelas:" + i + "  Valor:"+ (nova_parcela));
                }
                resto = resto -1;
                
            }
        }else if (valor_compra%numero_parcelas==0){
            for (int i = 0+1; i < numero_parcelas+1; i++) {
                System.out.println("Parcelas:" + i + "  Valor:"+ nova_parcela);
            }
        }
        
        

       
    }
    
}
