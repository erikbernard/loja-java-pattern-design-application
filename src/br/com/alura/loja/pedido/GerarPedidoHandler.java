package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GerarPedidoHandler {

    // metodo que recebe o comando
    public void execute(GeraPedido dados) {
        var orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        var pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Pedido: " + pedido.getCliente() + " " + pedido.getOrcamento());
    }
}
