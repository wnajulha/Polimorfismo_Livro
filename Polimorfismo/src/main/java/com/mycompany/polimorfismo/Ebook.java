
package com.mycompany.polimorfismo;

public class Ebook extends Livro{
    
     private double tamanhoArquivo;

    public Ebook(double tamanhoArquivo, String titulo, String autor, double preco) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + "MB");
    }
    
    
     
    
}
