package com.exemplo.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

    private static final double DELTA = 0.001;

    private final CalculadoraFrete calculadora = new CalculadoraFrete();

    @Test
    void livroDevePagarFreteFixo() {
        assertEquals(5.0, calculadora.visitar(new Livro(40.0)), DELTA);
    }

    @Test
    void eletronicoAcimaDoLimiteDevePagarFretePesado() {
        assertEquals(50.0, calculadora.visitar(new Eletronico(100.0, 10.5, false)), DELTA);
    }

    @Test
    void eletronicoNoLimiteDevePagarFreteLeve() {
        assertEquals(20.0, calculadora.visitar(new Eletronico(100.0, 10.0, false)), DELTA);
    }
}
