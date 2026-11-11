package com.delivery.solid.srp;

import com.delivery.solid.lsp.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa estritamente os dados e o estado de um Pedido (SRP).
 */
public class Pedido {
    private String id;
    private String cliente;
    private List<Produto> itens;
    private double valorTotal;
    private String status;

    public Pedido(String id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = "CRIADO";
        this.valorTotal = 0.0;
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
        valorTotal += produto.getPreco();
    }

    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
