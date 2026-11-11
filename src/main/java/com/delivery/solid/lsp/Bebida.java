package com.delivery.solid.lsp;

public class Bebida extends Produto {
    private double tamanhoMl;
    private boolean gelada;

    public Bebida(String nome, double preco, double tamanhoMl, boolean gelada) {
        super(nome, preco);
        this.tamanhoMl = tamanhoMl;
        this.gelada = gelada;
    }

    @Override
    public String getDetalhes() {
        return "Bebida: " + tamanhoMl + "ml" + (gelada ? " (Bem gelada)" : "");
    }
}
