import java.util.Scanner;

public class Problema_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Aréa original 
        double comprimento_total_cedula= 160;
        double altura_da_cedula = 70;
        double area_da_cedula = comprimento_total_cedula* altura_da_cedula;

        double B;
        double T;

        System.out.println("Digite o valor do B:");
        B = scanner.nextDouble();

        System.out.println("Digite o valor do T:");
        T = scanner.nextDouble();
        
        scanner.close();
        double area_corte = ((B + T)*altura_da_cedula)/2;
        double metade_area_total = area_da_cedula/2;
    
        if (area_corte<= 11200) {
            if (area_corte>metade_area_total) {
                System.out.println("Franscisco, ganhou R$50,00 reais");
                System.out.println(area_corte);
            }else if(area_corte <metade_area_total){
                System.out.println("Franscisca, ganhou R$50,00 reais");
                System.out.println(area_corte);
            }
            else{
                System.out.println("Nenhum dos dois ganhou 50 reais");
                System.out.println(area_corte);
            }
        }else{
            System.out.println("Impossivel cortar");
        }

       

        

    }
}
