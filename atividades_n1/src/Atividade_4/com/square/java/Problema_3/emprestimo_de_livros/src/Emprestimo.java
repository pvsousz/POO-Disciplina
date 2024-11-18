public class Emprestimo {
    
    private Livro livro;
    private Pessoa pessoa;

    public Emprestimo(Pessoa pessoa, Livro livro) {
        this.livro = livro;
        this.pessoa = pessoa;
    }

    public Emprestimo() {
    }
    
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
}
