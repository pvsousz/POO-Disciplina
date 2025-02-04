package problema_1;

public class ContaCorrente {
    private String nome;
    private String agencia;
    private String conta;
    private double saldo;

    
    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public ContaCorrente() {
    }


    public ContaCorrente(String nome, String agencia, String conta, Double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo  = saldo;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }


    public void depositar(double valor){
        this.saldo = valor;
    }


    public void transferir(ContaCorrente destino, double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo +valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }

    public void sacarSaldo(double valor){
        if (this.saldo <= valor) {
            throw new IllegalArgumentException("Saldo insuficiente");

        }else{
            this.saldo = this.saldo - valor;
        }
    }
    public void depositarSaldo(double valor){
        this.saldo = this.saldo + valor;
    }

    public void transferirSaldo(ContaCorrente destino, double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo +valor;
        }else{
            System.out.println("Saldo insuficiente");
        }

    }



    @Override
    public String toString() {
        return "ContaCorrente [nome=" + nome + "\n, agencia=" + agencia + "\n, conta=" + conta + "\n, saldo=" + saldo + "]";
    }


    

}
