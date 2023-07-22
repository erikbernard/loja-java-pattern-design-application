package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoOrcamentoMaisDeQuinhentos extends Desconto {

    
    public DescontoOrcamentoMaisDeQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    } 
}
