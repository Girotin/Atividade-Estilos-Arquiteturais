package com.delivery.solid.main;

import com.delivery.solid.lsp.*;
import com.delivery.solid.srp.*;
import com.delivery.solid.ocp.*;
import com.delivery.solid.isp.*;
import com.delivery.solid.dip.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE DELIVERY - APLICANDO PRINCIPIOS SOLID ===\n");

        // 3. LSP (Liskov Substitution Principle): Subclasses de Produto usadas transparentemente
        Produto pizza = new Pizza("Pizza Margherita", 45.0, "Margherita", true);
        Produto hamburguer = new Hamburguer("Burger Artesanal", 30.0, "Ao ponto");
        Produto bebida = new Bebida("Refrigerante Lata", 7.0, 350, true);

        // 1. SRP (Single Responsibility Principle): Instanciação separada do Pedido, Repositório e View
        Pedido pedido = new Pedido("PED-001", "Ana Silva");
        pedido.adicionarItem(pizza);
        pedido.adicionarItem(hamburguer);
        pedido.adicionarItem(bebida);

        PedidoRepository repository = new PedidoRepository();
        PedidoView view = new PedidoView();

        // Salvando o pedido
        repository.salvar(pedido);

        // Exibindo as informações do pedido
        view.exibirInformacoes(pedido);
        System.out.println();

        // 2. OCP (Open/Closed Principle): Pagamentos diferentes sem alterar código base
        System.out.println("--- Testando OCP (Formas de Pagamento) ---");
        Pagamento pagamentoPix = new PixPagamento("ana.silva@pix.com");
        pagamentoPix.processarPagamento(pedido.getValorTotal());
        
        System.out.println();

        // 5. DIP (Dependency Inversion Principle): Notificação desacoplada via abstração
        System.out.println("--- Testando DIP (Notificações Desacopladas) ---");
        CanalNotificacao canalEmail = new EmailNotificacao();
        ServicoNotificacaoDesacoplado servicoEmail = new ServicoNotificacaoDesacoplado(canalEmail);
        servicoEmail.notificarCliente(pedido, "Seu pedido foi confirmado e está sendo preparado!");

        CanalNotificacao canalWhats = new WhatsAppNotificacao();
        ServicoNotificacaoDesacoplado servicoWhats = new ServicoNotificacaoDesacoplado(canalWhats);
        servicoWhats.notificarCliente(pedido, "Seu pedido saiu para entrega via WhatsApp!");

        System.out.println("\n=== FIM DA EXECUÇÃO COM SUCESSO ===");
    }
}
