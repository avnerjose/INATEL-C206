package butickets;

public class CarrinhoDeCompras {
    String loginCliente; 
    Ingresso[] ingressos;
    
    CarrinhoDeCompras(){
        ingressos = new Ingresso[100]; 
    }
    
    public void addIngresso(Ingresso ingresso){
        
        for (int i = 0; i < ingressos.length; i++) {
            if(ingressos[i] == null){
                ingressos[i] = ingresso; 
                break;
            }
        }
    }
    
    public void mostraDetalhesCompras(){
        System.out.println("Compras do usuario: " + loginCliente);
        for (Ingresso ingresso: ingressos) {
            if (ingresso != null) {
                ingresso.mostraInfos();
                System.out.println("=========================");
            }
        }
    }
   
}
