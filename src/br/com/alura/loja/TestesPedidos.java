package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GerarPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
    public static void main(String[] args) {
        var cliente = "Ana da Silva";
        var valorOrcamento = new BigDecimal("100");
        var quantidadeItens = Integer.parseInt("5");

        var gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        gerador.executar();

        var handle = new GerarPedidoHandler(
            Arrays.asList(
                new SalvarPedidoNoBancoDeDados(), 
                new EnviarEmailPedido(),
                new LogDePedido()
            )
        );
        handle.execute(gerador);
    }
}
