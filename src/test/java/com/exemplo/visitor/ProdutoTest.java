package com.exemplo.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProdutoTest {

    private static final double VISITOU_LIVRO = 1.0;
    private static final double VISITOU_ELETRONICO = 2.0;
    private static final double DELTA = 0.001;

    private final ProdutoVisitor visitorFalso = new ProdutoVisitor() {
        @Override
        public double visitar(Livro livro) {
            return VISITOU_LIVRO;
        }

        @Override
        public double visitar(Eletronico eletronico) {
            return VISITOU_ELETRONICO;
        }
    };

    @Test
    void livroDeveDespacharParaVisitarLivro() {
        assertEquals(VISITOU_LIVRO, new Livro(40.0).aceitar(visitorFalso), DELTA);
    }

    @Test
    void eletronicoDeveDespacharParaVisitarEletronico() {
        assertEquals(VISITOU_ELETRONICO, new Eletronico(100.0, 2.0, false).aceitar(visitorFalso), DELTA);
    }
}
