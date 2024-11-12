package problema_2;

public class Aluno {
    private long matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media_etapa1;
    private double media_etapa2;
    private double media_final;




    public double getMedia_final() {
        return media_final;
    }

    public void setMedia_final(double media_final) {
        this.media_final = media_final;
    }

    public Aluno() {
    }

    public Aluno(long matricula, String nome, double nota1, double nota2, double nota3, double nota4,
            double media_etapa1, double media_etapa2, double media_final) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media_etapa1 = media_etapa1;
        this.media_etapa2 = media_etapa2;
        this.media_final = media_final;
    }

    public void calcularMediaPorEtapa(int etapa, int peso1, int peso2){
        if (etapa == 1) {
            this.media_etapa1 = (this.nota1*peso1 + this.nota2*peso2)/(peso1 +peso2);    
        }else if (etapa == 2) {
            this.media_etapa2 = (this.nota3*peso1+ this.nota4*peso2)/(peso1 +peso2); 
        }
          
    }


    public double calcularMediaFinal(){
       this.media_final = (media_etapa1 + media_etapa2)/2;

        return media_final;
    }


    public String calculaResultadoFinal(){
        if (media_final >= 7) {
            return "Aprovado!";
        }else if (media_final <5) {
            return "Reprovado";
        }else{
            return "Avaliação Final";
        }
        
    }




    public long getMatricula() {
        return matricula;
    }




    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }




    public String getNome() {
        return nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }




    public double getNota1() {
        return nota1;
    }




    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }




    public double getNota2() {
        return nota2;
    }




    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }




    public double getNota3() {
        return nota3;
    }




    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }




    public double getNota4() {
        return nota4;
    }




    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }




    public double getMedia_etapa1() {
        return media_etapa1;
    }




    public void setMedia_etapa1(double media_etapa1) {
        this.media_etapa1 = media_etapa1;
    }




    public double getMedia_etapa2() {
        return media_etapa2;
    }

    public void setMedia_etapa2(double media_etapa2) {
        this.media_etapa2 = media_etapa2;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", media_etapa1=" + media_etapa1 + ", media_etapa2="
                + media_etapa2 + ", calcularMediaFinal()=" + calcularMediaFinal() + ", calculaResultadoFinal()="
                + calculaResultadoFinal() + "]";
    }

    
}




