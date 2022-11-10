package cap13;

import java.util.ArrayList;

public class Cap13 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Avner", 20, "111.111.111", "Açougueiro");
        Funcionario f2 = new Funcionario("Joao", 40, "222.222.222-22", "Desenvolvedor");
        Arquivo arq = new Arquivo();
        ArrayList<Funcionario> funcs = new ArrayList();

        arq.escrever(f1);
        arq.escrever(f2);

        funcs = arq.ler();

        for (Funcionario aux : funcs) {
            System.out.println("Nome: " + aux.getNome());
            System.out.println("CPF: " + aux.getCpf());
            System.out.println("Idade: " + aux.getIdade());
            System.out.println("Cargo: " + aux.getCargo());
        }

    }
}
