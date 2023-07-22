package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public interface Imposto {
    public BigDecimal calcular(Orcamento orcamento);
}
