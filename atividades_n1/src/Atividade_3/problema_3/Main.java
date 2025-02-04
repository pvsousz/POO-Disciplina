package problema_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Voo voo = new Voo(443,LocalDate.of(2024, 04, 4));
        
        System.out.println("Número de voo: " + voo.getNumero());
        System.out.println("Data do voo: " + voo.getData());
        System.out.println("Poltrona: " + voo.ocuparPoltrona(3));
        System.out.println("Poltronas livres: " + voo.retornarVagas());
        
    }
}
