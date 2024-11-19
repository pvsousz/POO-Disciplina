package problema_2;

public class CamaroteSuperior extends Vip {

    @Override
    public double getValor() {
        // TODO Auto-generated method stub
        return super.getValor();
    }

    @Override
    public double imprimirValor(double valor) {
        System.out.println("Camarote Superior");
        return super.imprimirValor(valor + 20);
    }

    @Override
    public void setValor(double valor) {
        // TODO Auto-generated method stub
        super.setValor(valor);
    }
    
}
