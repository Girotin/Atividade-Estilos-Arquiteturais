package com.delivery.solid.ocp;

/**
 * Interface que define o contrato para formas de pagamento (OCP).
 * Permite adicionar novas formas sem alterar o código existente.
 */
public interface Pagamento {
    boolean processarPagamento(double valor);
}
