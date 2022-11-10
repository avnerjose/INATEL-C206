package avner1579av2;

public abstract class Pessoa {
    //Atributos
    public static int qtdPessoa;
    private String nome;
    private int idade;
    private int honra;
    public Arma arma;
    
    public void mostraInfo(){
        System.out.println("-------Informações------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Honra: " + honra);
        if(arma != null){
            System.out.println("Informações da arma: ");
            System.out.println(" Tipo: " + arma.getTipo());
        }else{
            System.out.println("Essa pessoa não possui armamento!");
        }
    }
    //Método abstrato 
    public abstract void orar();
    //Getters
    public String getNome() {
        return nome;
    }

    public int getHonra() {
        return honra;
    }
    //Setters
    public void setHonra(int honra) {
        this.honra = honra;
    }
    
    public static void setQtdPessoa(int qtdPessoa) {
        Pessoa.qtdPessoa = qtdPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
