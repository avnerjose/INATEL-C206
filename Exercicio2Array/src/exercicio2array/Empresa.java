package exercicio2array;

public class Empresa {

    String cnpj;
    String endereco;
    Contato[] contatos;

    void exibirInfos() {
        int i = 1;
        System.out.println("=======Dados da empresa=======");
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("-----------Contatos-----------");

        for (Contato contato : contatos) {
            if (contato != null) {
                System.out.println("Contato " + i + ":");
                System.out.println("Nome: " + contato.nome);
                System.out.println("Email: " + contato.email);
                System.out.println("Telefone: " + contato.telefone);
                System.out.println("Dada de nascimento: " + contato.dataNascimento);
                System.out.println("------------------------------");
            }
            i++;
        }
    }
}
