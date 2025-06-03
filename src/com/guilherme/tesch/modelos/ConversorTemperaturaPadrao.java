package com.guilherme.tesch.modelos;

import com.guilherme.tesch.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
