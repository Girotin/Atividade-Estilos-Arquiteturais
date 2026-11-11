package com.delivery.solid.ocp;

public class PixPagamento implements Pagamento {
    private String chavePix;

    public PixPagamento(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("[Pagamento] Processando R$ " + valor + " via PIX (Chave: " + chavePix + ")");
        return true;
    }
}
