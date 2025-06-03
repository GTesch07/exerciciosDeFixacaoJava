package com.guilherme.tesch.modelos;

import com.guilherme.tesch.interfaces.Vendaval;

public class ProdutoVendaval implements Vendaval {
    private String nome;
    private double precoUnitario;

    public ProdutoVendaval(String nome, double precoUnitario){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return precoUnitario -(precoUnitario*percentual/100);
    }
    public String getNome(){
        return nome;
    }
}
