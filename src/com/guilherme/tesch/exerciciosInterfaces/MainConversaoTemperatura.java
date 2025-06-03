package com.guilherme.tesch.exerciciosInterfaces;

import com.guilherme.tesch.modelos.ConversorTemperaturaPadrao;

public class MainConversaoTemperatura {
    public static void main(String[] args){
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();

        double tempC = 25.0;
        double tempF = 77.0;

        System.out.printf("%.2f°C = %.2f°F%n", tempC, conversorTemperaturaPadrao.celsiusParaFahrenheit(tempC));
        System.out.printf("%.2f°F = %.2f°C%n", tempF, conversorTemperaturaPadrao.fahrenheitParaCelsius(tempF));
    }
}
