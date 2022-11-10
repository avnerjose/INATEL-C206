package butickets;

public class VIP extends Ingresso{
    protected String tamanhoAbada; 
    
    @Override  
    void mostraInfos(){
        super.mostraInfos();
        System.out.println("Tipo: VIP");
        System.out.println("Tamanho do Abada: " + tamanhoAbada);
    }
}
