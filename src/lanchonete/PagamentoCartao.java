package lanchonete;

public class PagamentoCartao implements Pagamento{
    private String numeroCartao;
    
    @Override
    public boolean pagar(double valor) {
        System.out.printf("Pafando R$"+valor+" com cartao");
        return true;
    }

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


}
