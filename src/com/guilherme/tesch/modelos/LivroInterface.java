package com.guilherme.tesch.modelos;

import com.guilherme.tesch.interfaces.Calculavel;

public class LivroInterface implements Calculavel {
    private String titulo;
    private double preco;
    private double descontoPercentual;

    public LivroInterface(String titulo, double preco, double descontoPercentual){
        this.titulo = titulo;
        this.preco = preco;
        this.descontoPercentual = descontoPercentual;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * descontoPercentual/100);
    }
    public String getTitulo(){
        return titulo;
    }
}
