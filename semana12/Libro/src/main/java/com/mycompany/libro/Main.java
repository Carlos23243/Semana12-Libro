package com.mycompany.libro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Libro> catalogo = new HashMap<>();
        Map<String, List<String>> usuarios = new HashMap<>();

        // Registrar usuarios
        usuarios.put("U1", new ArrayList<>());
        usuarios.put("U2", new ArrayList<>());

        // Añadir libros
        catalogo.put("ISBN-001", new Libro("ISBN-001", "Clean Code", "Robert C. Martin", "Software"));
        catalogo.put("ISBN-002", new Libro("ISBN-002", "Effective Java", "Joshua Bloch", "Java"));

        // Prestar libros
        usuarios.get("U1").add("ISBN-001");
        usuarios.get("U2").add("ISBN-002");

        // Listar libros prestados de U1
        System.out.println("Libros prestados a U1:");
        for (String isbn : usuarios.get("U1")) {
            System.out.println(catalogo.get(isbn));
        }

        // Devolver libro de U1
        usuarios.get("U1").remove("ISBN-001");

        // Buscar por autor
        System.out.println("\nBuscar autor 'Bloch':");
        for (Libro l : catalogo.values()) {
            if (l.autor.contains("Bloch")) System.out.println(l);
        }

        // Buscar por categoría
        System.out.println("\nBuscar categoría 'Software':");
        for (Libro l : catalogo.values()) {
            if (l.categoria.contains("Software")) System.out.println(l);
        }
    }
}
