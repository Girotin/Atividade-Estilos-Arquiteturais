package com.delivery.solid.dip;

import com.delivery.solid.srp.Pedido;

public class WhatsAppNotificacao implements CanalNotificacao {
    @Override
    public void enviar(Pedido pedido, String mensagem) {
        System.out.println("[WhatsApp para " + pedido.getCliente() + "]: " + mensagem);
    }
}
