package varejo;

public class Geladeira extends Mercadoria {

    private int quantidadePortas;
    private int tamanho;
    private String tipo;

    public Geladeira(
            int codigo, String fabricante,
             String descricao, double Valor,
            int quantidadePortas, int tamanho, String tipo) {
        this.setCodigo(codigo);
        this.setFabricante(fabricante);
        this.setDescricao(descricao);
        this.setValor(Valor);
        this.quantidadePortas = quantidadePortas;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
    
    @Override
    public void mostraInfo(){
        System.out.println("Produto: Geladeira");
        super.mostraInfo();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
        System.out.println("Tamanho: " + tamanho); 
        System.out.println("Tipo: " + tipo);
    }
}
