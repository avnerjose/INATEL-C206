package exercicio3array;

public class Restaurante {

    String nome;
    String cnpj;
    String endereco;
    Fornecedor[] fornecedores;

    void exibirInfos() {
        int i = 1;
        System.out.println("========Dados do restaurante=======");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("------Dados dos fornecerdores------");

        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor != null) {
                System.out.println("Fornecedor " + i + ":");
                System.out.println("Tipo: " + fornecedor.tipo);
                System.out.println("Quantidade: " + fornecedor.quantidade);
                System.out.println("-----------------------------------");
            }
            i++;
        }
    }
}
