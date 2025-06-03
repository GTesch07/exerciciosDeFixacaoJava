package com.guilherme.tesch.exerciciosInterfaces;

import com.guilherme.tesch.modelos.ProdutoVendaval;
import com.guilherme.tesch.modelos.ServicoVendaval;

public class MainVendaval {
    public static void main(String[] args){
        ProdutoVendaval produtoVendaval = new ProdutoVendaval("Notebook", 3000.00);
        ServicoVendaval servicoVendaval = new ServicoVendaval("Consultoria", 200.00);

        int quantidadeProdutos = 2;
        int horasServico = 5;

        System.out.printf("Preço total de %d '%s' R$ %.2f%n",quantidadeProdutos, produtoVendaval.getNome(),produtoVendaval.calcularPrecoTotal(quantidadeProdutos) );

        System.out.printf("Preço unitário com 10%% de desconto: R$ %.2f%n",produtoVendaval.aplicarDesconto(10));

        System.out.printf("Preço total de %d horas de '%s': R$ %.2f%n",horasServico,servicoVendaval.getDescricao(),servicoVendaval.calcularPrecoTotal(horasServico));

        System.out.printf("Preço por hora com 5%% de desconto: R$ %.2f%n",servicoVendaval.aplicarDesconto(5));
    }
}
