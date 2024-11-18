import java.time.Year;


public class Livro {
    private String titulo;
    private String autor;
    private int edicao;
    private Year ano;
    private String editora;


    
    public Livro() {
    }

    public Livro(String titulo, String autor, int edicao, Year ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Year getAno() {
        return ano;
    }

    public void setAno(Year ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Titulo:" + getTitulo() + ", Autor:" + getAutor() + ", Edição:" + getEdicao()
                + ", Ano:" + getAno() + ", Editora:" + getEditora();
    }
}
