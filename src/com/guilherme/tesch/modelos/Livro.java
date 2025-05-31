package com.guilherme.tesch.modelos;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void exibiDetalhes(){
        System.out.println("Título do livro: " + getTitulo());
        System.out.println("Nome do Autor: "+ getAutor());
    }
}
