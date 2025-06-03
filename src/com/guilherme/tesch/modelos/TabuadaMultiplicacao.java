package com.guilherme.tesch.modelos;

import com.guilherme.tesch.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;

    public TabuadaMultiplicacao(int numero){
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada de multiplicação do número "+ numero +":");
        for (int i = 1; i <= 10; i ++){
            System.out.printf("%d x %d = %d\n", numero,i,numero *i);
        }
    }
}
