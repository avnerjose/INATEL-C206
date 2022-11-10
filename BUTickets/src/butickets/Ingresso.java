package butickets;

import java.util.Date;

public class Ingresso {
    private static long numberGenerator; 
    private long numero; 
    protected float valorIngresso; 
    protected static float taxaCartao; 
    protected Date dataHoraCompra;
    
    Ingresso(){
        numberGenerator++;
      
        numero = numberGenerator; 
        
        taxaCartao = 5;
        
        dataHoraCompra = new Date();
    }
    
    float calculaTotalIngresso(){
        return valorIngresso+taxaCartao; 
    }
    
    void mostraInfos(){
        System.out.println("Informaçoes do ingresso: " + numero);
        System.out.println("Valor total do ingresso: " + calculaTotalIngresso());
        System.out.println("Valor do Ingresso: " + valorIngresso);
        System.out.println("Taxa do Cartao: " + taxaCartao);
        System.out.println("Data da compra: " + dataHoraCompra);
    }
    
    
    
}
