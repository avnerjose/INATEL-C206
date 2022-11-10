package butickets;

public class Kids extends VIP {
    private String docResponsaveis;
    int num; 
    @Override  
    void mostraInfos(){
        super.mostraInfos();
        System.out.println("Tipo: Kids");
        System.out.println("Documento dos responsaveis: " + docResponsaveis);
     
    }
    
    @Override
    public float calculaTotalIngresso(){
        return super.calculaTotalIngresso()/2; 
    }
   
}
