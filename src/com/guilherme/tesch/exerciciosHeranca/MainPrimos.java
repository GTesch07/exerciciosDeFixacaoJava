package com.guilherme.tesch.exerciciosHeranca;

import com.guilherme.tesch.modelos.GeradorPrimo;
import com.guilherme.tesch.modelos.NumerosPrimos;
import com.guilherme.tesch.modelos.VerificadorPrimo;

public class MainPrimos {
    public static void main(String[] args){
        VerificadorPrimo verificador = new VerificadorPrimo();
        NumerosPrimos numero = new NumerosPrimos();
        numero.setNumero(17);
        verificador.verificarSeEhPrimo(numero.getNumero()); //deve dizer que é primo

        GeradorPrimo gerador = new GeradorPrimo();
        int proximo = gerador.gerarProximoPrimo(17);
        System.out.println("Próximo número primo após " + numero.getNumero() + ": " + proximo);

        NumerosPrimos base = new NumerosPrimos();
        base.listarPrimos(50);
    }
}
