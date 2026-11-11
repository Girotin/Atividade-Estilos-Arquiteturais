package com.delivery.solid.ocp;

public class DinheiroPagamento implements Pagamento {
    private double valorRecebido;

    public DinheiroPagamento(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valorRecebido < valor) {
            System.out.println("[Pagamento] Valor insuficiente em dinheiro!");
            return false;
        }
        double troco = valorRecebido - valor;
        System.out.println("[Pagamento] Processando R$ " + valor + " em Dinheiro. Troco a devolver: R$ " + troco);
        return true;
    }
}
