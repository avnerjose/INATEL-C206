package projetoteste;

public class Cliente {

    private String nome;
    private String email;
    private String cpf;
    private Endereco endereco = new Endereco();

    public Cliente(String nome, String email, String cpf, String cidade,
            String cep, String rua, String bairro, int numero) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco.setCidade(cidade);
        this.endereco.setCep(cep);
        this.endereco.setBairro(bairro);
        this.endereco.setRua(rua);
        this.endereco.setNumero(numero);
    }

    public void mostraCliente() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: ");
        System.out.println("Cidade: " + this.endereco.getCidade());
        System.out.println("CEP: " + this.endereco.getCep());
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("Numero" + this.endereco.getNumero());
    }
}
