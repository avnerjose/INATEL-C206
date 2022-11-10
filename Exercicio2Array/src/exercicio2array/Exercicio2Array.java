package exercicio2array;

import java.util.Scanner;

public class Exercicio2Array {

    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa();
        Contato[] contatos = new Contato[100];
        Scanner scan = new Scanner(System.in);
        int entrada;
        int i = 0;

        System.out.println("Entre com os dados da empresa: ");
        System.out.print("CNPJ: ");
        minhaEmpresa.cnpj = scan.nextLine();
        System.out.print("Endereço: ");
        minhaEmpresa.endereco = scan.nextLine();

        System.out.println("Dados dos contados: ");
        System.out.println("1- Adicionar 1 novo contato");
        System.out.println("2- Encerrar o processo");

        entrada = scan.nextInt();

        while (entrada != 2) {
            contatos[i] = new Contato();
            scan.nextLine();
            System.out.print("Nome: ");
            contatos[i].nome = scan.nextLine();
            System.out.print("Email: ");
            contatos[i].email = scan.nextLine();
            System.out.print("Telefone: ");
            contatos[i].telefone = scan.nextLine();
            System.out.print("Dada de nascimento: ");
            contatos[i].dataNascimento = scan.nextLine();

            i++;

            System.out.println("1- Adicionar 1 novo contato");
            System.out.println("2- Encerrar o processo");

            entrada = scan.nextInt();

        }

        minhaEmpresa.contatos = contatos;
        minhaEmpresa.exibirInfos();

    }

}
