package com.delivery.solid.lsp;

public class Pizza extends Produto {
    private String sabor;
    private boolean bordaRecheada;

    public Pizza(String nome, double preco, String sabor, boolean bordaRecheada) {
        super(nome, preco);
        this.sabor = sabor;
        this.bordaRecheada = bordaRecheada;
    }

    @Override
    public String getDetalhes() {
        return "Pizza sabor: " + sabor + (bordaRecheada ? " (Borda Recheada)" : "");
    }
}
