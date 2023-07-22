package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{
    
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido!");
    }
}
