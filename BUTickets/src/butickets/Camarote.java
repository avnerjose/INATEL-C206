package butickets;

public class Camarote extends Ingresso{
    private String tamanhoCamiseta;
    
    @Override  
    void mostraInfos(){
        super.mostraInfos();
        System.out.println("Tipo: Camarote");
        System.out.println("Tamanho da camiseta: " + tamanhoCamiseta);
    }
}       
