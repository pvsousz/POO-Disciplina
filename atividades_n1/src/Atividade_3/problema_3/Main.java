package problema_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Voo voo = new Voo(443,LocalDate.of(2024, 04, 4));
        
        
        
       
        System.out.println(voo.ocuparPoltrona(1));
        System.out.println(voo.ocuparPoltrona(1));
        voo.ocuparPoltrona(2);
        System.out.println(voo.verificarPoltrona(1));
        System.out.println(voo.retornarVagas());
        voo.ocuparPoltrona(100);
        
    }
}
