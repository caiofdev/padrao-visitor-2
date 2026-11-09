package com.exemplo.visitor;

public interface ProdutoVisitor {

    double visitar(Livro livro);

    double visitar(Eletronico eletronico);
}
