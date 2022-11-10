package aula2104;

public class Camiseta extends Produto {

    private String cor;
    private String tamanho;

    Camiseta(String nome, double preco, String cor, String tamanho) {
        this.setNome(nome);
        this.setPreco(preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    @Override 
    String etiquetaPreco(){
        String etiqueta ; 
        
        etiqueta ="Tipo: Camiseta\n" + super.etiquetaPreco() + "\nCor: " + cor 
                + "\nTamanho: " + tamanho; 
        
        return etiqueta; 
    }

}
