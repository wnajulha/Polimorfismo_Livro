package com.mycompany.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Livro[] L = new Livro[4];

        
        L[0] = new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 59.90);
        L[1] = new Ebook(2.5,"Clean Code", "Robert C. Martin", 45.90);
        L[2] = new Livro("Java: Como Programar", "Deitel & Deitel", 89.90);
        L[3] = new Ebook( 1.8,"Harry Potter e a Pedra Filosofal", "J.K. Rowling", 39.90);

        
        for (int i = 0; i < L.length; i++) {
            System.out.println("Livro " + (i + 1) + ":");
            L[i].exibirDetalhes();
            System.out.println();
        }
    }
    }

        
     
