package problema_1;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int num_patas, String cor, String ambiente, float velocidade_media,
            String caracteristica) {
        super(nome, comprimento, num_patas, cor, ambiente, velocidade_media);
        this.caracteristica = caracteristica;
    }

    @Override
    public String getAmbiente() {
        // TODO Auto-generated method stub
        return super.getAmbiente();
    }

    @Override
    public float getComprimento() {
        // TODO Auto-generated method stub
        return super.getComprimento();
    }

    @Override
    public String getCor() {
        // TODO Auto-generated method stub
        return super.getCor();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public int getNum_patas() {
        // TODO Auto-generated method stub
        return super.getNum_patas();
    }

    @Override
    public float getVelocidade_media() {
        // TODO Auto-generated method stub
        return super.getVelocidade_media();
    }

    @Override
    public void setAmbiente(String ambiente) {
        // TODO Auto-generated method stub
        super.setAmbiente(ambiente);
    }

    @Override
    public void setComprimento(float comprimento) {
        // TODO Auto-generated method stub
        super.setComprimento(comprimento);
    }

    @Override
    public void setCor(String cor) {
        // TODO Auto-generated method stub
        super.setCor(cor);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setNum_patas(int num_patas) {
        // TODO Auto-generated method stub
        super.setNum_patas(num_patas);
    }

    @Override
    public void setVelocidade_media(float velocidade_media) {
        // TODO Auto-generated method stub
        super.setVelocidade_media(velocidade_media);
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Característica:" + getCaracteristica());
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

}
