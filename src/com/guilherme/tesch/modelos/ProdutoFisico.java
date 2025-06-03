package com.guilherme.tesch.modelos;

import com.guilherme.tesch.interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {
    private String nome;
    private double preco;
    private double taxaTransporte;

    public ProdutoFisico(String nome, double preco, double taxaTransporte){
        this.nome = nome;
        this.preco = preco;
        this.taxaTransporte = taxaTransporte;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxaTransporte;
    }

    public String getNome(){
        return nome;
    }
}
