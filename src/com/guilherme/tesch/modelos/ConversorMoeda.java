package com.guilherme.tesch.modelos;

import com.guilherme.tesch.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA_CONVESAO = 5.25;

    @Override
    public double ConverterDolarParaReal(double valorEmDolar) {
       return valorEmDolar * TAXA_CONVESAO;    }



}
