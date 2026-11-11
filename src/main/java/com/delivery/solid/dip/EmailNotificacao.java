package com.delivery.solid.dip;

import com.delivery.solid.srp.Pedido;

public class EmailNotificacao implements CanalNotificacao {
    @Override
    public void enviar(Pedido pedido, String mensagem) {
        System.out.println("[EMAIL para " + pedido.getCliente() + "]: " + mensagem);
    }
}
