package problema_1;

import java.sql.SQLOutput;

class TesteErro {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();

        try {
            c1.sacarSaldo(100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
