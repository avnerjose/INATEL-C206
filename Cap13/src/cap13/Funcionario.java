package cap13;

public class Funcionario {

    private String nome;
    private int idade;
    private String cpf;
    private String cargo;

    Funcionario() {
    }

    Funcionario(String nome, int idade, String cpf, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
