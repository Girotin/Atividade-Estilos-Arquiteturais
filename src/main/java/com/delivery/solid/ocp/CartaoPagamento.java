package com.delivery.solid.ocp;

public class CartaoPagamento implements Pagamento {
    private String numeroCartao;

    public CartaoPagamento(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("[Pagamento] Processando R$ " + valor + " via Cartão de Crédito (Final: " + 
            (numeroCartao.length() > 4 ? numeroCartao.substring(numeroCartao.length() - 4) : numeroCartao) + ")");
        return true;
    }
}
