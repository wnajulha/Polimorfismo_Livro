
package com.mycompany.polimorfismo;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    
    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preco: " + preco);
    }
}
