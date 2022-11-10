package varejo;

public class Varejo {

    public static void main(String[] args) {
        Mercadoria[] mercadorias = new Mercadoria[2];
        
        mercadorias[0] = new Fogao(1,"Eletrolux","Fogao top demais, bonito e funcional",
        1599,5,"Acendimento Automático");
        mercadorias[1] = new Geladeira(2,"Brastemp","Geladeira 2 portas com freezer potente",
        2750,2,375,"Frost Free");
        
        for (int i = 0; i < 2; i++) {
            System.out.println("**************");
            mercadorias[i].mostraInfo();
        }
    }
}
