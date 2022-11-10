package aula1703212;

public class Aula1703212 {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto(); 
        
        p1.nome = "Pasta de dente"; 
        p1.categoria = "Higiene Pessoal";
        p1.quantidade = 467; 
        p1.codigoProduto = "PD-20";
        p1.codigoSerie = 121; 
        
        p2.nome = "Cookies de Chocolate"; 
        p2.categoria = "Doce"; 
        p2.quantidade = 231; 
        p2.codigoProduto = "CC-52";
        p2.codigoSerie = 214; 
        
        p1.mostraInfo();
        System.out.println("\n");
        p2.mostraInfo();
    }
}
