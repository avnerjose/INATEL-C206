package avner1579av2;

public class Avner1579AV2 {

    public static void main(String[] args) {
        //Instanciando objetos 
        Arma a1 = new Arma("Espada longa");
        Arma a2 = new Arma("Espada de aço Valiriano");
        Arma a3 = new Arma("Espada longa de aço Valiriano");
        Montaria m1 = new  Montaria("Pé de pano"); 
        Cavaleiro c1 = new Cavaleiro("Brienne of Tarth",23,120,a1,"Tarth","Podrick",null);
        Cavaleiro c2 = new Cavaleiro("Jaime Lannister",40,30,null,"Lennister","Bron",m1);
        Guarda g1 = new Guarda("Jon Snow",18,80,a2);
        Lorde l1 = new Lorde("Eddard Stark",35,150,a3,"Stark",1269);
        Pessoa[] pessoas = new Pessoa[10];
        
        //Adicinando os objetos no Array
        pessoas[0] = c1;
        pessoas[1] = g1;
        pessoas[2] = l1;
        pessoas[3] = c2;
        
        //Chamando os métodos de cada uma das classes
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] != null){
                if(pessoas[i] instanceof Cavaleiro){
                    Cavaleiro aux = (Cavaleiro)pessoas[i];
                    aux.orar();
                    aux.fazerPatrulha();
                    aux.consagrarCavaleiro();
                }else if(pessoas[i] instanceof Guarda){
                    Guarda aux = (Guarda)pessoas[i];
                    aux.orar();
                    aux.fazerPatrulha();
                }else if(pessoas[i] instanceof Lorde){
                   Lorde aux = (Lorde)pessoas[i];
                   aux.orar();
                   aux.consagrarCavaleiro();
                }
                pessoas[i].mostraInfo();
                System.out.println("***************************");
            }
        }
        //Mostra o total de pessoas criadas
        System.out.println("Total de pessoas criadas: " + Pessoa.qtdPessoa);
    }
}
