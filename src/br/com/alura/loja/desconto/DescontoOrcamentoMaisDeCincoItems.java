package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoOrcamentoMaisDeCincoItems extends Desconto {
    public DescontoOrcamentoMaisDeCincoItems(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
