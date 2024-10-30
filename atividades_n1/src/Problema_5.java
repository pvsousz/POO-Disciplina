
import java.util.Scanner;

public class Problema_5 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       System.out.println("Digite a em qual chave zhao estará:");
       int zhao = scanner.nextInt();
       System.out.println("Digite a em qual chave Liu estará:");
       int liu = scanner.nextInt();
       scanner.close();
    

       if (zhao/8 != liu/8) {
        System.out.println("Final");
       }else if (zhao/4 != liu/4) {
        System.out.println("Semi");
       }else if (zhao/2 != liu/2) {
        System.out.println("Quarta");
       }else{
        System.out.println("Oitavas");
       }
       



       
    }


}
