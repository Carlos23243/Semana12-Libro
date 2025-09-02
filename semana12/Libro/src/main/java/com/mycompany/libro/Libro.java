package com.mycompany.libro;

public class Libro {

    String isbn;
    String titulo, autor, categoria;

    public Libro(String isbn, String titulo, String autor, String categoria) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "[" + isbn + "] " + titulo + " - " + autor + " (" + categoria + ")";
    }
}
