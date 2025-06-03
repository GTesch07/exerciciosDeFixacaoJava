package com.guilherme.tesch.modelos;

import com.guilherme.tesch.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    public CalculadoraSalaRetangular(double altura,double largura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
}
