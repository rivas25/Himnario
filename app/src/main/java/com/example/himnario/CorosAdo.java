package com.example.himnario;

public class CorosAdo {
    private int id;
    private String titulo;
    private String autor;
    private String letra;

    public CorosAdo() {
    }

    public CorosAdo(int id, String titulo, String autor, String letra) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.letra = letra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return  titulo;
    }

    public  String tostring(){
        return  "ID: " + id + "\n"+
                "TÍTULO: " + titulo + "\n"+
                "AUTOR: " + autor + "\n\n"+
                "LETRA: " +  "\n" + letra ;
    }
}
