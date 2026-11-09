package com.exemplo.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraImpostoTest {

    private static final double DELTA = 0.001;

    private final CalculadoraImposto calculadora = new CalculadoraImposto();

    @Test
    void livroDeveSerIsento() {
        assertEquals(0.0, calculadora.visitar(new Livro(40.0)), DELTA);
    }

    @Test
    void eletronicoImportadoDevePagarTrintaPorCento() {
        assertEquals(30.0, calculadora.visitar(new Eletronico(100.0, 2.0, true)), DELTA);
    }

    @Test
    void eletronicoNacionalDevePagarQuinzePorCento() {
        assertEquals(15.0, calculadora.visitar(new Eletronico(100.0, 2.0, false)), DELTA);
    }
}
