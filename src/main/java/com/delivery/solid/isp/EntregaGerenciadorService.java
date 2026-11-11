package com.delivery.solid.isp;

import com.delivery.solid.srp.Pedido;

public interface EntregaGerenciadorService {
    void despacharEntrega(Pedido pedido);
}
