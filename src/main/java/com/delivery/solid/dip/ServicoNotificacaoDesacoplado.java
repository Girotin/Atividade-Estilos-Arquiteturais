package com.delivery.solid.dip;

import com.delivery.solid.srp.Pedido;

/**
 * Classe principal de notificação que depende apenas da abstração (CanalNotificacao),
 * aplicando estritamente o Dependency Inversion Principle (DIP).
 */
public class ServicoNotificacaoDesacoplado {
    private final CanalNotificacao canalNotificacao;

    public ServicoNotificacaoDesacoplado(CanalNotificacao canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }

    public void notificarCliente(Pedido pedido, String mensagem) {
        canalNotificacao.enviar(pedido, mensagem);
    }
}
