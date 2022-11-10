package exercicio1array;

public class Carrinho {

    double total;
    Produto[] produtos;

    void exibirInfo() {
        System.out.println("=======Dados da compra =======");
        int i = 1;
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println("Produto " + i + ":");
                System.out.println("Nome: " + produto.nome);
                System.out.println("Descricao: " + produto.descricao);
                System.out.println("Fabricante: " + produto.fabricante);
                System.out.println("Preço: R$ " + produto.preco);
                System.out.println("--------------------------------");
            }
            i++;
        }
    }

    double calculaTotal() {

        for (Produto produto : produtos) {
            if (produto != null) {
                total += produto.preco;
            }
        }

        return total;
    }
}
