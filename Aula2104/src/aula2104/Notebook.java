package aula2104;

public class Notebook extends Produto{
    private double armazenamento; 
    private String gpu; 
    private String processador;
    
    Notebook(String nome, double preco, double armazenamento, String gpu, String processador){
        this.setNome(nome);
        this.setPreco(preco);
        this.armazenamento = armazenamento; 
        this.gpu = gpu; 
        this.processador = processador; 
    }
    
    @Override 
    String etiquetaPreco(){
        String etiqueta ; 
        
        etiqueta ="Tipo: Notebook\n" + super.etiquetaPreco() + "\nArmazenamento: " 
                + armazenamento + " GB" + "\nGPU: " + gpu + "\nProcessador: " 
                + processador; 
        
        return etiqueta; 
    }
}
