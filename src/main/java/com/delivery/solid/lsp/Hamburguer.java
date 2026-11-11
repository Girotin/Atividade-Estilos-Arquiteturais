package com.delivery.solid.lsp;

public class Hamburguer extends Produto {
    private String pontoCarne;

    public Hamburguer(String nome, double preco, String pontoCarne) {
        super(nome, preco);
        this.pontoCarne = pontoCarne;
    }

    @Override
    public String getDetalhes() {
        return "Hambúrguer - Ponto da carne: " + pontoCarne;
    }
}
