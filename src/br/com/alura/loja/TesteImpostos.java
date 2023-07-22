package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostos {

    public static void main(String[] args) {
        var primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        var segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        var calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(primeiro, null));
        System.out.println(calculadora.calcular(segundo, null));

    }

}
