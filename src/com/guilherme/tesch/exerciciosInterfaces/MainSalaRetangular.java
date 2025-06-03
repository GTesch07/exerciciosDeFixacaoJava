package com.guilherme.tesch.exerciciosInterfaces;

import com.guilherme.tesch.modelos.CalculadoraSalaRetangular;

public class MainSalaRetangular {
    public static void main(String[] args){
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular(3.5,5.0);

        System.out.printf("Área da sala: %.2f m²\n", calculadoraSalaRetangular.calcularArea());

        System.out.printf("Perímetro da sala: %.2f m\n", calculadoraSalaRetangular.calcularPerimetro());

    }
}
