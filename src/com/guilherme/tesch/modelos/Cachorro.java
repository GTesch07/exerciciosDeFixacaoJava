package com.guilherme.tesch.modelos;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Cachorro latindo: AU AU AU!!");
    }

    public void abanarRabo(){
        System.out.println("O cachocorro está abanando o rabo!!");
    }
}
