package aula2104;

public class Produto {
    private String nome;
    private double preco; 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    String etiquetaPreco(){
        String etiqueta; 
        
        etiqueta = "Nome: " + nome + "\nPreço: " + preco; 
        
        return etiqueta; 
    }
}   
