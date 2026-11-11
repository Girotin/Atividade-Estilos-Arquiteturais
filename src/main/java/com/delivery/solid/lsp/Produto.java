package com.delivery.solid.lsp;

/**
 * Classe base abstrata para todos os produtos do restaurante (LSP).
 */
public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String getDetalhes();
}
