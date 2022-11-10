package pcmania;

public class Cliente {
    String nome; //Nome do cliente
    long cpf;//CPF do cliente
    Computador[] compras; //Referencia para um array de computadores
    
    float calculaTotalCompra(){
        float total = 0; 
        //Percorre as compras e soma os precos 
        for (int i = 0; i < compras.length; i++) {
           if(compras[i] != null){
               total += compras[i].preco;
           } 
        }
        
        return total;
    }
}
