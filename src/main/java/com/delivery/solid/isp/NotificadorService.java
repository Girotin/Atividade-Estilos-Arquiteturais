package com.delivery.solid.isp;

import com.delivery.solid.srp.Pedido;

public interface NotificadorService {
    void enviarNotificacao(Pedido pedido, String mensagem);
}
