package com.exemplo.visitor;

public record Eletronico(double preco, double pesoKg, boolean importado) implements Produto {

    @Override
    public double aceitar(ProdutoVisitor visitor) {
        return visitor.visitar(this);
    }
}
