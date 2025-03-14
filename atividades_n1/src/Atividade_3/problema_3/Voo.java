package problema_3;

import java.time.LocalDate;
import java.util.Arrays;

public class Voo {
    private int numero;
    private LocalDate data;
    private boolean[] poltronas;



    public Voo(int numero, LocalDate data) {
        this.numero = numero;
        this.data = data;
        this.poltronas = new boolean[100];
    }

    public int retornarVagas(){
        int vagas = 0;
        for(boolean ocupada: this.poltronas){
            if (!ocupada) {
                vagas++;                
            }
        }
        return vagas;
    }

    public int proximoLivre() {
        for (int i = 0; i < this.poltronas.length; i++) {
            if (!this.poltronas[i]) {
                return i +1;
            }
        }
        return -1; 
    }

    public boolean verificarPoltrona(int poltrona){
        if (poltrona <1 || poltrona > 100) {
            System.out.println("Número da poltrona indisponível");
        }
        return this.poltronas[poltrona -1];
    }

    public boolean ocuparPoltrona(int poltrona){
        if (verificarPoltrona(poltrona)){
            return false;
        }
        this.poltronas[poltrona  -1] = true;
        return true;
    }


    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }



    public LocalDate getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }



    public boolean[] getPoltronas() {
        return this.poltronas;
    }




    public void setPoltronas(boolean[] poltronas) {
        this.poltronas = poltronas;
    }

    public void resetar(){
        for (int i = 0; i < poltronas.length; i++) {
            poltronas[i] = false;
        }
    }



    @Override
    public String toString() {
        return "Voo [getNumero()=" + getNumero() + ", getData()=" + getData() + "]";
    }



    

    

}
