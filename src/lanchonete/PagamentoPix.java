
package lanchonete;

public class PagamentoPix implements Pagamento {
    private String chavePix;
    @Override
    public boolean pagar(double valor) {
       System.out.printf("Pagando R$"+valor+" com o PIX");
        return true;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
    
}
