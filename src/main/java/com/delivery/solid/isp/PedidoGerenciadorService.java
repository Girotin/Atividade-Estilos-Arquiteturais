package com.delivery.solid.isp;

import com.delivery.solid.srp.Pedido;

public interface PedidoGerenciadorService {
    void processarNovoPedido(Pedido pedido);
}
