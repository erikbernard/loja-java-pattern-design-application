package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento) {
        var desconto = new DescontoOrcamentoMaisDeCincoItems(
            new DescontoOrcamentoMaisDeQuinhentos(
                new SemDesconto()
        ));
        return desconto.calcular(orcamento);
    }   
}
