package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }
    public void executar() {
        var orcamento = new Orcamento(valorOrcamento, quantidadeItens);
        var pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
        System.out.println("Pedido: " + pedido.getCliente() + " " + pedido.getOrcamento());
    }
    public String getCliente() {
        return cliente;
    }
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }
    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }
}
