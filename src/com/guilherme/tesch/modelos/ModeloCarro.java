package com.guilherme.tesch.modelos;

public class ModeloCarro extends Carro {

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Preços nos últimos 3 anos: ");
        for (int i = 0; i < precosAnuais.length; i ++) {
            System.out.println("Ano " + (i + 1) + ": R$ " + precosAnuais[i]);
        }
        System.out.println("Menor preço: R$ " + getMenorPreco());
        System.out.println("Maior preço: R$ " + getMaiorPreco());
    }
}
