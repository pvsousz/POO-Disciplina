package problema_1;

public class Main {
    public static void main(String[] args) {
       
        System.out.println("****Animal*****");
        Animal animal = new Animal();
        animal.dados();

        System.out.println("*****Peixe*****");
        Peixe peixe = new Peixe("Tucunaré",(float)0.30,0,"Cinza","Áquatico",8,"Peixe de água doce");
        peixe.dados();

        System.out.println("*****Humano*****");
        Humano humano = new Humano("Vinicius", (float)1.75,2,"Pardo","Terrestre",(float)27,"Tudo comestivel");
        humano.dados();
    }
    
}
