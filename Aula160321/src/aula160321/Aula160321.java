package aula160321;

public class Aula160321 {

    public static void main(String[] args) {
        Atleta a1 = new Atleta(); 
        Time t1 = new Time(); 
        
        a1.nome = "Fred"; 
        a1.idade = 35; 
        a1.posicao = "Atacante"; 
        
        t1.atleta = a1; 
        t1.nome = "Fluminense";
        t1.nomeDoTecnico = "Josefino Sanches";
      
        
        System.out.println(t1.atleta.nome);
    }
}
