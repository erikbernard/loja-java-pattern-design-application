package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

    public static void main(String[] args) {
        var orcamento = new Orcamento(new BigDecimal("200"), 6);
        var calculadora = new CalculadoraDeImpostos();
    }
    
}
