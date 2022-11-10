package avner1579av2;

public class Guarda extends Pessoa implements Patrulha {
    
    //Atributos
    private int coragem;

    //Construtor 
    public Guarda(String nome, int idade,int honra, Arma arma) {
        Pessoa.qtdPessoa++;//Adiciona uma nova pessoa
        //Seta os valores
        this.setNome(nome);
        this.setIdade(idade);
        this.setArma(arma);
        this.setHonra(honra);
        //Obs: Não coloquei a "coragem" no construtor para que ela inicie zerada
        //e seja aumentada só se o Guarda fizer patrulha 
    }

    @Override
    public void mostraInfo() {
        System.out.println("Classificação: Guarda");
        System.out.println("Coragem: " + coragem);
        super.mostraInfo();//Chama o método mostraInfo da classe mãe
    }

    @Override
    public void orar() {
        System.out.println(this.getNome() + " fez uma oração aos deuses antigos");
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(this.getNome() + " fez uma patrulha além da muralha");
        coragem += 20;//Adiciona 20 de coragem 
    }

}
