package com.delivery.solid.srp;

import com.delivery.solid.lsp.Produto;

/**
 * Responsável exclusivamente por exibir as informações de um pedido (SRP - Apresentação).
 */
public class PedidoView {

    public void exibirInformacoes(Pedido pedido) {
        System.out.println("========================================");
        System.out.println("          DETALHES DO PEDIDO            ");
        System.out.println("========================================");
        System.out.println("ID do Pedido: " + pedido.getId());
        System.out.println("Cliente:      " + pedido.getCliente());
        System.out.println("Status:       " + pedido.getStatus());
        System.out.println("----------------------------------------");
        System.out.println("Itens:");
        for (Produto item : pedido.getItens()) {
            System.out.println(" - " + item.getNome() + " | R$ " + item.getPreco() + " | " + item.getDetalhes());
        }
        System.out.println("----------------------------------------");
        System.out.println("Valor Total:  R$ " + pedido.getValorTotal());
        System.out.println("========================================");
    }
}
