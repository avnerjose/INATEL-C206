package sistemacarrinhodecompra;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto p) {
        produtos.add(p);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    
}
