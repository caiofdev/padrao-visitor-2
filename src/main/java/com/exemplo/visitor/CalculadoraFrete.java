package com.exemplo.visitor;

public class CalculadoraFrete implements ProdutoVisitor {

    private static final double FRETE_LIVRO = 5.0;
    private static final double FRETE_LEVE = 20.0;
    private static final double FRETE_PESADO = 50.0;
    private static final double LIMITE_PESO_KG = 10.0;

    @Override
    public double visitar(Livro livro) {
        return FRETE_LIVRO;
    }

    @Override
    public double visitar(Eletronico eletronico) {
        if (eletronico.pesoKg() > LIMITE_PESO_KG) {
            return FRETE_PESADO;
        }
        return FRETE_LEVE;
    }
}
