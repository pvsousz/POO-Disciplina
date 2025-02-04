import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    static ArrayList<Livro> livros = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) throws Exception {
    
        
            int opcao= -1;
            do {
                menu();
                opcao = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcao) {
                    case 1:
                        cadastrarPessoa();
                        break;
                    case 2:
                        cadastrarLivro();
                         break;
                    case 3:
                        realizarEmprestimo();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                    
                }         
            } while (opcao !=0);
            
    
    
        }
        public static void menu(){
            System.out.println("****BIBLIOTECA****");
                System.out.println("1.Cadastrar Pessoa");
                System.out.println("2.Cadastrar Livro");
                System.out.println("3.Realizar Empréstimo");
                System.out.println("0.Sair");
                System.out.println("Escolha uma das opções:");
        }
    
        public static void cadastrarPessoa(){
            
            System.out.println("Nome:");
            String nome = scanner.nextLine();

            System.out.println("CPF:");
            String cpf = scanner.nextLine();

            System.out.println("Email:");
            String email = scanner.nextLine();

            System.out.println("Telefone:");
            String telefone = scanner.nextLine();

            System.out.println("**Endereço**");
            System.out.println("Bairro:");
            String bairro = scanner.nextLine();
            
            System.out.println("Cidade:");
            String cidade = scanner.nextLine();

            System.out.println("Estado");
            String estado = scanner.nextLine();
            
            System.out.println("Cep:");
            String cep = scanner.nextLine();

            Endereco endereco = new Endereco(bairro,cidade,estado,cep);
            Pessoa pessoa = new Pessoa(nome,cpf,email,telefone,endereco);
            pessoas.add(pessoa);
            System.out.println("Cadastro Realizado!!!!");
            
            for (Pessoa p: pessoas){
                System.out.println(p);
                System.out.println("-----------");
            }
    }
        public static void cadastrarLivro(){
            System.out.println("Título do livro:");
            String titulolivro = scanner.nextLine();

            System.out.println("Autor do livro:");
            String autorlivro = scanner.nextLine();

            System.out.println("Número de edição:");
            int numeroedicao = scanner.nextInt();

            System.out.println("Ano do livro:");
            Year ano = Year.of(scanner.nextInt());

            scanner.nextLine();

            System.out.println("Editora:");
            String editoralivro = scanner.nextLine();


            Livro livro = new Livro(titulolivro,autorlivro,numeroedicao,ano,editoralivro);
            livros.add(livro);
            System.out.println("Livro cadastrado com sucesso!!!");

            for (Livro l: livros){
                System.out.println(l);
                System.out.println("-----------");
            }

    }

    public static void realizarEmprestimo() {
        
        System.out.println("Escolha um livro para o empréstimo:");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(i + 1 + ". " + livros.get(i).getTitulo());
        }
        int livroEscolhido = scanner.nextInt() - 1; 
        scanner.nextLine();
    
        
        if (livroEscolhido < 0 || livroEscolhido >= livros.size()) {
            System.out.println("Livro inválido.");
            return;
        }
    
        System.out.println("Digite o seu nome para realizar o empréstimo:");
        String nomePessoa = scanner.nextLine();
    
        
        Pessoa pessoa = null;
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nomePessoa)) {
                pessoa = p;
                break;
            }
        }
        if (pessoa == null) {
            System.out.println("Pessoa não cadastrada. Empréstimo não realizado.");
        } else {
            Emprestimo emprestimo = new Emprestimo(pessoa, livros.get(livroEscolhido));
            System.out.println("Empréstimo realizado com sucesso!");
            System.out.println("Livro:" + emprestimo.getLivro() +"\nResponsavel:"+ emprestimo.getPessoa());
        }
    }
    
}
