package com.guilherme.tesch.exerciciosInterfaces;

import com.guilherme.tesch.modelos.LivroInterface;
import com.guilherme.tesch.modelos.ProdutoFisico;

public class MainCalculoPreco {
    public static void main(String[] args){
        LivroInterface livroInterface = new LivroInterface("Java para iniciantes", 100.0,15.0);

        ProdutoFisico produtoFisico = new ProdutoFisico("Mouse", 150.0, 20.0);

        System.out.printf("Preço final do livro '%s': R$ %.2f%n",livroInterface.getTitulo(),livroInterface.calcularPrecoFinal());

        System.out.printf("Preço final do produto '%s': R$ %.2f%n", produtoFisico.getNome(),produtoFisico.calcularPrecoFinal());
    }
}
