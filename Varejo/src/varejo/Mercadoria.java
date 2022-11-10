package varejo;

public abstract class Mercadoria {
    private int codigo;
    private String fabricante;
    private String descricao;
    private double valor;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void mostraInfo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
    };
    
}
