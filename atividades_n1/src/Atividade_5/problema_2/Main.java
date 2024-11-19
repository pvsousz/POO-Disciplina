package problema_2;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("***Ingresso VIP***");
        Vip ingresso_vip = new Vip();
        System.out.println(ingresso_vip.imprimirValor(50));

        System.out.println("***Ingresso Normal***");
        Normal ingre_normal = new Normal();
        System.out.println(ingre_normal.imprimirValor(50));


        System.out.println("-------------------");
        CamaroteInferior camarote_inferior = new CamaroteInferior();
        System.out.println(camarote_inferior.imprimirValor(50));

        System.out.println("-------------------");
        CamaroteSuperior camarote_superior = new CamaroteSuperior();
        System.out.println(camarote_superior.imprimirValor(50));

    }
    
}
