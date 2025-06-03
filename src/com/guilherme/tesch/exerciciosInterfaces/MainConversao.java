package com.guilherme.tesch.exerciciosInterfaces;

import com.guilherme.tesch.modelos.ConversorMoeda;

public class MainConversao {
    public static void main(String[] args){
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        double valorEmDolar = 100.00;
        double valorEmReais = conversorMoeda.ConverterDolarParaReal(valorEmDolar);

        System.out.printf("US$ %.2f equivalem a R$ %.2f\n", valorEmDolar, valorEmReais);
    }
}
