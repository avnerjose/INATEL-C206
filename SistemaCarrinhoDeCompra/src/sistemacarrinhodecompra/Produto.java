package sistemacarrinhodecompra;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto p) {
        /*Ordem crescente de preço, para a ordem decrescente
        Basta usar o Collections.reverse no arraylist*/
        return Double.compare(this.preco, p.preco);
        
        /*Ordem alfabética
        return this.nome.compareTo(p.nome);*/

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
