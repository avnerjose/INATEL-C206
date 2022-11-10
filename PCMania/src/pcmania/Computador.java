package pcmania;

public class Computador {

    String marca;
    float preco;
    SistemaOperacional sistema = new SistemaOperacional();//Insntancia um sistema operacional
    HardwareBasico[] hardwares = new HardwareBasico[100];//Instancia um array de Hardwares
    MemoriaUSB memoria;
   
    void mostraPCConfigs() {
        System.out.println("===== Informaçoes do Computador ====");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("-------- Sistema Operacional -------");
        System.out.println("Nome: " + sistema.nome);
        System.out.println("Tipo: " + sistema.tipo + " bits");
        System.out.println("--------- Hardwares Basicos --------");
        
        for (int i = 0; i < hardwares.length; i++) {
            if(hardwares[i]!= null){
                System.out.println(i+1 +":");
                System.out.println("Nome: " + hardwares[i].nome);
                System.out.println("Capacidade: " + hardwares[i].capacidade);
            }
        }
        
        if(memoria != null){
            System.out.println("------------ Memoria USB -----------");
            System.out.println("Nome: " + memoria.nome);
            System.out.println("Capacidade: " + memoria.capacidade);
        }
        
        System.out.println("====================================");
    } 
    
    void addMemoriaUSB(MemoriaUSB musb) {
        memoria = musb;
    }
}
