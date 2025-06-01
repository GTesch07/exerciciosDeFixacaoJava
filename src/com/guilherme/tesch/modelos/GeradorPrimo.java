package com.guilherme.tesch.modelos;

public class GeradorPrimo extends NumerosPrimos{
    //Gera o próximo número primo após um valor dado

    public int gerarProximoPrimo(int aPartirDe){
        int numero = aPartirDe + 1;
        while (!verificarPrimaridae(numero)){
            numero ++;
        }
        return numero;
    }
}
