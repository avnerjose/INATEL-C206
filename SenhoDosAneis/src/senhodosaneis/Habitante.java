package senhodosaneis;

public class Habitante {
    public static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    protected Arma arma; 
    
    public void atacar(){
        System.out.println("Atributos da arma: ");
        System.out.println("Nome: " + arma.getNomeArma());
        System.out.print("Magica: ");
        
        if(arma.isMagica()){
            energia -= 20;
            System.out.println("Sim");
        }else{
            energia -= 10;
            System.out.println("Não");
        }
    }
    
    public void mostraInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
        System.out.println("Arma: ");
        System.out.println(" Nome da arma: " + arma.getNomeArma());
        System.out.print(" Magica: ");
        if(arma.isMagica()){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }
    }
}
