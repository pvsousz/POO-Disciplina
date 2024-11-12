package problema_2;
public class Main {
    public static void main(String[] args) {
       
        Aluno aluno = new Aluno();
        
        aluno.setNome("Paulo Vinicius");
        aluno.setMatricula(001);

        aluno.setNota1(3);
        aluno.setNota2(6);
        aluno.setNota3(5);
        aluno.setNota4(5);

        aluno.calcularMediaPorEtapa(1, 2, 3 );
        aluno.calcularMediaPorEtapa(2, 3, 2 );

        
        System.out.println(aluno.toString());
       
        
    }
}
