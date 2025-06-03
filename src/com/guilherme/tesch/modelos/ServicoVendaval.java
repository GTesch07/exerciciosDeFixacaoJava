package com.guilherme.tesch.modelos;

import com.guilherme.tesch.interfaces.Vendaval;

public class ServicoVendaval implements Vendaval {
    private String descricao;
    private double precoPorHora;

    public ServicoVendaval (String descricao, double precoPorHora){
        this.descricao = descricao;
        this.precoPorHora = precoPorHora;
    }

    @Override
    public double calcularPrecoTotal(int horas) {
        return precoPorHora * horas;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return precoPorHora - (precoPorHora * percentual/100);
    }

    public String getDescricao(){
        return descricao;
    }
}
