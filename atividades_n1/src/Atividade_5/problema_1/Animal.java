package problema_1;

public class Animal {
    private String nome;
    private float comprimento;
    private int num_patas;
    private String cor;
    private String ambiente;
    private float velocidade_media;

    
    

    public Animal() {
    }


    public Animal(String nome, float comprimento, int num_patas, String cor, String ambiente, float velocidade_media) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.num_patas = num_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade_media = velocidade_media;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getComprimento() {
        return comprimento;
    }


    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }


    public int getNum_patas() {
        return num_patas;
    }


    public void setNum_patas(int num_patas) {
        this.num_patas = num_patas;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getAmbiente() {
        return ambiente;
    }


    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }


    public float getVelocidade_media() {
        return velocidade_media;
    }


    public void setVelocidade_media(float velocidade_media) {
        this.velocidade_media = velocidade_media;
    }

    public void dados(){
        System.out.println("Nome:" + getNome());
        System.out.println("Comprimento:" + getComprimento()+ "cm");
        System.out.println("Numero de patas:" + getNum_patas());
        System.out.println("Cor:" +getCor());
        System.out.println("Ambiente:" + getAmbiente());
        System.out.println("Velocidade média:" + getVelocidade_media()+"km" );
    }
    
    
    
}