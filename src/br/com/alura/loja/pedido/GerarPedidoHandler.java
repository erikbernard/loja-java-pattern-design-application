package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GerarPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    // metodo que recebe o comando
    public void execute(GeraPedido dados) {
        var orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        var pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Pedido: " + pedido.getCliente() + " " + pedido.getOrcamento());

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
