package senhodosaneis;

public class Elfo extends Habitante implements Cura{
    private String tribo;
    
    public void viajar(){
        System.out.println("O Elfo está viajando!");
    }
    
    public Elfo(String nome,int idade,float energia,String tribo,Arma arma){
        Habitante.contador++;
        this.id = contador; 
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.tribo = tribo;
        this.arma = arma; 
    }
    
    @Override
    public void atacar(){
        super.atacar();
        System.out.println("O Elfo atacou!");
    }
    
    @Override
    public void mostraInfo(){
        System.out.println("Raça: Elfo");
        super.mostraInfo();
        System.out.println("Tribo: " + tribo);
    }

    @Override
    public void curar() {
        this.energia = this.energia*1.15F;
        System.out.println("O Elfo foi curado!");
    }
}
