import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Problema_5 {
    public static void main(String[] args) {
        List<Integer> jogadores = new ArrayList<>();
        Random random = new Random();
        boolean contem = true;

        for (int i = 1; i <= 16; i++) {
            jogadores.add(i);            
        }
        Collections.shuffle(jogadores,random);
        System.out.println("*********CAMPEONATO**********");
        System.out.println("Lista de jogadores:"+jogadores);

        while (contem) {
            
            if (jogadores.contains(7)&& jogadores.contains(1)) {


                int index7 = jogadores.indexOf(7);
                int index1 = jogadores.indexOf(1);
                if (Math.abs(index7 - index1) == 1) {
                    System.out.println("Próximos(ZHAO E Liu)");
                }

                
                    // Oitavas de finais
                jogadores.remove(random.nextInt(0,1)); 
                jogadores.remove(random.nextInt(1,2));        
                jogadores.remove(random.nextInt(2,3));
                jogadores.remove(random.nextInt(3,4));
                jogadores.remove(random.nextInt(4,5));
                jogadores.remove(random.nextInt(5,6));
                jogadores.remove(random.nextInt(6,7));
                jogadores.remove(random.nextInt(7,8));
                System.out.println("---------------Oitavas de Final----------------");
                System.out.println("Lista de jogadores:"+jogadores);

               
               
            }else{
    
                contem = false;
                
            }
                //Quartas de finais
            if (jogadores.contains(7)&& jogadores.contains(1))
            
            {
                int index7 = jogadores.indexOf(7);
                int index1 = jogadores.indexOf(1);
                if (Math.abs(index7 - index1) == 1) {
                    System.out.println("Próximos(ZHAO E Liu)");
                }
                jogadores.remove(random.nextInt(0,1));
                jogadores.remove(random.nextInt(1,2));
                jogadores.remove(random.nextInt(2,3));
                jogadores.remove(random.nextInt(3,4));
                System.out.println("---------------QUARTAS----------------");
                System.out.println("Lista de jogadores:"+jogadores);

               
            }else{
                
                contem = false;
            }
                // SemiFinal
            if (jogadores.contains(7)&& jogadores.contains(1))
            {
                int index7 = jogadores.indexOf(7);
                int index1 = jogadores.indexOf(1);
                if (Math.abs(index7 - index1) == 1) {
                    System.out.println("Próximos(ZHAO E Liu)");
                }
                jogadores.remove(random.nextInt(0,1));
                jogadores.remove(random.nextInt(1,2));
                System.out.println("---------------SEMI----------------");
                System.out.println("Lista de jogadores:"+jogadores);

          
            }else
            {
                
                contem = false;
            }    
                // Final
            if (jogadores.contains(7)&& jogadores.contains(1))
            {   
                int index7 = jogadores.indexOf(7);
                int index1 = jogadores.indexOf(1);
                if (Math.abs(index7 - index1) == 1) {
                    System.out.println("Próximos (ZHAO E Liu)");
                }
                jogadores.remove(random.nextInt(0,1));
                System.out.println("---------------GRAND FINALE----------------");
                System.out.println("Lista de jogadores:"+jogadores);

                
            }else
            {
                
                contem = false;
            }   
           
        }
         
            
    }

}

