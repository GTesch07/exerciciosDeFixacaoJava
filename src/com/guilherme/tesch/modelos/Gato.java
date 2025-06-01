package com.guilherme.tesch.modelos;

public class Gato extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Gato miando: MIAU MIAU MIAU!");
    }

    public void arranharMoveis(){
        System.out.println("O gato está arranhando os móveis.");
    }
}
