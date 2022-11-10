package varejo;

public class Fogao extends Mercadoria {
    private int quantidadeBocas;
    private String tipoAcendimento;
    
    public Fogao(
            int codigo, String fabricante,
             String descricao, double Valor,
            int quantidadeBocas,String tipoAcendimento) {
        this.setCodigo(codigo);
        this.setFabricante(fabricante);
        this.setDescricao(descricao);
        this.setValor(Valor);
        this.quantidadeBocas = quantidadeBocas;
        this.tipoAcendimento = tipoAcendimento;
    }
    
    @Override
    public void mostraInfo(){
        System.out.println("Produto: Fogao");
        super.mostraInfo();
        System.out.println("Quantidade de Bocas: " + quantidadeBocas);
        System.out.println("Tipo de acendimento: " + tipoAcendimento); 
    }
}
