package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {
    public BigDecimal carcularValorDescocntoExtras(Orcamento orcamentos) {
        return orcamentos.getValor().multiply(new BigDecimal("0.05"));
    }

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
