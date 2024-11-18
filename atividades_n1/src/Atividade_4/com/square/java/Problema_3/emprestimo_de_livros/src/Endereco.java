public class Endereco {
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;


    public Endereco() {
    }
    
    public Endereco(String bairro, String cidade, String estado, String cep) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }


    @Override
    public String toString() {
        return " Bairro:" + bairro + ", Cidade:" + cidade + ", Estado:" + estado + ", CEP:" + cep;
    }
}
