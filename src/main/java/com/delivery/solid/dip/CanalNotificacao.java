package com.delivery.solid.dip;

import com.delivery.solid.srp.Pedido;

/**
 * Abstração (Interface) para os meios de notificação (DIP).
 */
public interface CanalNotificacao {
    void enviar(Pedido pedido, String mensagem);
}
