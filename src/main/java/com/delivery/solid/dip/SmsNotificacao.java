package com.delivery.solid.dip;

import com.delivery.solid.srp.Pedido;

public class SmsNotificacao implements CanalNotificacao {
    @Override
    public void enviar(Pedido pedido, String mensagem) {
        System.out.println("[SMS para " + pedido.getCliente() + "]: " + mensagem);
    }
}
