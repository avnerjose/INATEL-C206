package aula1703212;

public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria; 
    int quantidade;
    
    void mostraInfo(){
        System.out.println("==== Informaçoes do Produto ====");
        System.out.println("Nome: " + nome);
        System.out.println("Codigo de serie: " + codigoSerie);
        System.out.println("Codigo do produto: " + codigoProduto);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
    }
}
