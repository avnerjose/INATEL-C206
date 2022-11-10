package senhodosaneis;

public class Anao extends Habitante implements Mineracao{
    private float altura;
    private String reino;
    
    public Anao(String nome,int idade,float energia,float altura,String reino,Arma arma){
        Habitante.contador++;
        this.id = contador; 
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.altura = altura;
        this.reino = reino; 
        this.arma = arma; 
    }
    
    @Override
    public void atacar(){
        super.atacar();
        System.out.println("O Anao atacou!");
    }
    
    @Override
    public void mostraInfo(){
        System.out.println("Raça: Anao");
        super.mostraInfo();
        System.out.println("Altura: " + altura);
        System.out.println("Reino: " + reino);
    }

    @Override
    public void minerar() {
        System.out.println("O Anao está minerando!");
    }
}
