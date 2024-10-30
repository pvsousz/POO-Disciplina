package Atividade_2;

public class Problema_3 {
    public static void main(String[] args) {
        double chico = 1.50;
        double ze = 1.10;
           
        int anos = 0;
        while (chico>=ze) {
            chico = chico + 0.02;
            ze = ze + 0.03;
            anos = anos +1;
        }

        System.out.println("Chico:"+ String.format("%.2f", chico));
        System.out.println("Zé:"+ String.format("%.2f", ze));
        System.out.println("Anos:"+anos+" serão necessários para que Zé seja maior que Chico");
    }
}
