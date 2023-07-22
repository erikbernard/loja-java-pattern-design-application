package br.com.alura.loja;

import java.math.BigDecimal;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GerarPedidoHandler;

public class TestesPedidos {
    public static void main(String[] args) {
        var cliente = args[0];
        var valorOrcamento = new BigDecimal(args[1]);
        var quantidadeItens = Integer.parseInt(args[2]);    

        var gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        gerador.executar();

        var handle =  new GerarPedidoHandler();    
        handle.execute(gerador);   
    }
}
