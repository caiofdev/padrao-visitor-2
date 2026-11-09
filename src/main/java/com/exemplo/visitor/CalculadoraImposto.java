package com.exemplo.visitor;

public class CalculadoraImposto implements ProdutoVisitor {

    private static final double ALIQUOTA_IMPORTADO = 0.30;
    private static final double ALIQUOTA_NACIONAL = 0.15;

    @Override
    public double visitar(Livro livro) {
        return 0.0;
    }

    @Override
    public double visitar(Eletronico eletronico) {
        if (eletronico.importado()) {
            return eletronico.preco() * ALIQUOTA_IMPORTADO;
        }
        return eletronico.preco() * ALIQUOTA_NACIONAL;
    }
}
