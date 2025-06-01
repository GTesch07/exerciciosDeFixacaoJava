package com.guilherme.tesch.modelos;

public class VerificadorPrimo extends NumerosPrimos{


    public void verificarSeEhPrimo(int numero){
        if (verificarPrimaridae(numero)){
            System.out.println(numero + " é um número primo.");
        }else{
            System.out.println(numero + " não é um número primo.");
        }

    }


}
