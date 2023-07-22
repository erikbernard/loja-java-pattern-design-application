package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ICMSSComIss extends Imposto {

    public ICMSSComIss(Imposto outro) {
        super(outro);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        BigDecimal icms = new ICMS(null).calcular(orcamento);
        BigDecimal iss = new ISS(null).calcular(orcamento);
        return icms.add(iss);
    }
    
}
