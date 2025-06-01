package com.guilherme.tesch.exerciciosHeranca;

import com.guilherme.tesch.modelos.ModeloCarro;

public class MainCarro {
    public static void main(String[] args){
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setModelo("Honda Civic");
        carro1.setPrecos(40000, 55000, 70000);

        carro1.mostrarInformacoes();

    }
}
