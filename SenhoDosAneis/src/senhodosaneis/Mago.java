package senhodosaneis;

public class Mago extends Habitante implements Cura, Feitico {

    private String cor;

    public Mago(String nome, int idade, float energia,String cor, Arma arma) {
        Habitante.contador++;
        this.id = contador;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.cor = cor;
        this.arma = arma;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("O Mago atacou!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Raça: Mago");
        super.mostraInfo();
        System.out.println("Cor: " + cor);
    }

    @Override
    public void curar() {
        this.energia = this.energia*1.15F;
        System.out.println("O Mago foi curado!");
    }

    @Override
    public void lancaFeitico() {
        this.energia = this.energia * 0.9F;
        System.out.println("O Mago lancou um feitico!");
    }
}
