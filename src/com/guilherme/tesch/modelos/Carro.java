package com.guilherme.tesch.modelos;

public abstract class Carro {
    protected String nomeModelo;
    protected double[] precosAnuais = new double[3];

//    public String getNomeModelo(){
//        return nomeModelo;
//    }

    public void setModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    //    public double[] getPrecosAnuais(){
//        return precosAnuais;
//    }
//
    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        precosAnuais[0] = precoAno1;
        precosAnuais[1] = precoAno2;
        precosAnuais[2] = precoAno3;
    }

    // Utilizar o : é equivalente ao metodo tradicional do for, serve para percorrer uma array e executar um bloco.
    //  double[] precosAnuais = {85000, 89000, 87000};

    //for (double preco : precosAnuais) {
//        System.out.println("Preço: R$ " + preco);
//    }
    public double getMenorPreco() {
        double menor = precosAnuais[0];
        for (double preco : precosAnuais) {
            if (preco < menor) {
                menor = preco;
            }
        }
        return menor;
    }

    public double getMaiorPreco(){
        double maior = precosAnuais[0];
        for (double preco : precosAnuais){
            if (preco > maior){
                maior = preco;
            }
        }
        return maior;
    }

    public void mostrarInformacoes(){
        System.out.println("Modelo: " + nomeModelo);
    }
}