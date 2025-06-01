package com.guilherme.tesch.modelos;

public class NumerosPrimos {

    public int numero;

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    //Verifica se o numero é primo
    public boolean verificarPrimaridae(int numero){
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0)return false;
        }
        return true;
    }

    // Lista os números primos até um limite
    public void listarPrimos(int limite){
        System.out.println("Números primos até: " + limite + ":");
        for (int i = 2; i <= limite; i ++){
            if (verificarPrimaridae(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
