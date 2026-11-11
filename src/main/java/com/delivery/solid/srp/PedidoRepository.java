package com.delivery.solid.srp;

import java.util.HashMap;
import java.util.Map;

/**
 * Responsável exclusivamente por salvar e recuperar pedidos (SRP - Persistência).
 */
public class PedidoRepository {
    private Map<String, Pedido> bancoDeDadosFalso = new HashMap<>();

    public void salvar(Pedido pedido) {
        bancoDeDadosFalso.put(pedido.getId(), pedido);
        System.out.println("[DB] Pedido " + pedido.getId() + " salvo com sucesso no banco de dados.");
    }

    public Pedido buscarPorId(String id) {
        return bancoDeDadosFalso.get(id);
    }
}
