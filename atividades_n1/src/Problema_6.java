import java.util.Scanner;

public class Problema_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite as coordenadas do primeiro retângulo (x0 y0 x1 y1): ");
        double x0_1 = scanner.nextDouble();
        double y0_1 = scanner.nextDouble();
        double x1_1 = scanner.nextDouble();
        double y1_1 = scanner.nextDouble();

       
        System.out.println("Digite as coordenadas do segundo retângulo (x0 y0 x1 y1): ");
        double x0_2 = scanner.nextDouble();
        double y0_2 = scanner.nextDouble();
        double x1_2 = scanner.nextDouble();
        double y1_2 = scanner.nextDouble();

       
        boolean naoInterseccionam = (x0_1 > x1_2) || (x1_1 < x0_2) || (y1_1 < y0_2) || (y0_1 > y1_2);

        if (naoInterseccionam) {
            System.out.println("Os retângulos não se interceptam.");
        } else {
            System.out.println("Os retângulos se interceptam.");
        }

        scanner.close();
    }
}
