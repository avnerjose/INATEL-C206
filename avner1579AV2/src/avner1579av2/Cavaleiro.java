package avner1579av2;

public class Cavaleiro extends Pessoa implements Patrulha, Consagra {

    //Atributos
    private String casa;
    private String nomeEscudeiro;
    public Montaria montaria;
    
    //Construtor 
    public Cavaleiro(String nome,int idade,int honra,Arma arma,
            String casa,String nomeEscudeiro,Montaria montaria){
        Pessoa.qtdPessoa++;//Adiciona uma pessoa
        //Seta as informações
        this.setNome(nome);
        this.setIdade(idade);
        this.setArma(arma);
        this.setHonra(honra);
        this.casa = casa;
        this.nomeEscudeiro = nomeEscudeiro;
        this.montaria = montaria; 
    }
    
    @Override
    public void orar() {
        System.out.println(this.getNome() + " fez uma oração ao deus do fogo");
    }
    //Mostra as informações do Cavaleiro
    @Override
    public void mostraInfo() {
        System.out.println("Classificação: Cavaleiro");
        System.out.println("Casa: " + casa);
        System.out.println("Nome do escudeiro: " + nomeEscudeiro);
        if(montaria != null){
            System.out.println("Informações da montaria: ");
            System.out.println(" Nome: " + montaria.getNome());
        }else{
            System.out.println("Este cavaleiro não possui montaria!");
        }
        super.mostraInfo();//Chama o mostraInfo da classe mãe
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(this.getNome() + " fez uma patrulha pelo reino");
    }

    @Override
    public void consagrarCavaleiro() {
        System.out.println(this.getNome() + " consagrou um novo cavaleiro");
        this.setHonra(this.getHonra()+5);//Adiciona 5 de honra
    }
}
