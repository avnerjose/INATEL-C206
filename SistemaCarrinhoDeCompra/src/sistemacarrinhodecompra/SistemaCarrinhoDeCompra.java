package sistemacarrinhodecompra;

import java.util.Collections;

public class SistemaCarrinhoDeCompra {
    
    public static void main(String[] args) {
        Carrinho c1 = new Carrinho();
        Produto p1 = new Produto("Lapiseira", 17.3);
        Produto p2 = new Produto("Geladeira", 1789.50);
        Produto p3 = new Produto("Caderno", 30.43);
        Produto p4 = new Produto("Picolé", 11.50);
        Produto p5 = new Produto("Mouse gamer com muito LED", 450.29);
        Produto p6 = new Produto("Cadeira de praia", 65.3);
        
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p3);
        c1.addProduto(p4);
        c1.addProduto(p5);
        c1.addProduto(p6);
        /*Exemplo com ordem decrescente de preços, os outros
        items estão comentados no médoto compareTo da classe Produto*/
        Collections.sort(c1.getProdutos());
        Collections.reverse(c1.getProdutos());
        
        for (Produto produto : c1.getProdutos()) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preco: " + produto.getPreco());
        }
    }
}
