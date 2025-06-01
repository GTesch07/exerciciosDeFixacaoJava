package com.guilherme.tesch.exerciciosHeranca;

import com.guilherme.tesch.modelos.Animal;
import com.guilherme.tesch.modelos.Cachorro;
import com.guilherme.tesch.modelos.Gato;

public class MainAnimal {
    public static void main(String[] args){
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        // Polimorfismo: chama o metodo correto mesmo com tipo Animal

        meuCachorro.emitirSom();
        meuGato.emitirSom();

        // Métodos específicos das subclasses
        Cachorro cachorroReal = new Cachorro();
        Gato gatoReal = new Gato();

        gatoReal.arranharMoveis();
        cachorroReal.abanarRabo();
        
    }
}
