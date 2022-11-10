package avner1579av2;

public class Lorde extends Pessoa implements Consagra {

    //Atributos
    private String casa;
    private int qtdVassalos;

    public Lorde(String nome, int idade,int honra,Arma arma, String casa,int qtdVassalos) {
        Pessoa.qtdPessoa++;//Adiciona uma nova pessoa
        //Seta os valores dos métodos
        this.setNome(nome);
        this.setIdade(idade);
        this.setArma(arma);
        this.setHonra(honra);
        this.casa = casa;
        this.qtdVassalos = qtdVassalos; 
    }

    @Override
    public void orar() {
        System.out.println(this.getNome() + " fez uma oração aos sete deuses");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Classificação: Lorde");
        System.out.println("Casa: " + casa);
        System.out.println("Quantidade de vassalos: " + qtdVassalos);
        super.mostraInfo();
    }

    @Override
    public void consagrarCavaleiro() {
        System.out.println(this.getNome() + " consagrou um novo cavaleiro");
        qtdVassalos++;//Adiciona uma vassalo
    }

}
