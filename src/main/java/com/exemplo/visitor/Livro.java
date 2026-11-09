package com.exemplo.visitor;

public record Livro(double preco) implements Produto {

    @Override
    public double aceitar(ProdutoVisitor visitor) {
        return visitor.visitar(this);
    }
}
