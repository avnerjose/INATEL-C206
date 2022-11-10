package exercicio3array;

import java.util.Scanner;

public class Exercicio3Array {

    public static void main(String[] args) {
        Restaurante meuRestaurante = new Restaurante();
        Fornecedor[] fornecedores = new Fornecedor[100];
        Scanner scan = new Scanner(System.in);
        int entrada;
        int i = 0;

        System.out.println("Preencha as informaçoes do restaurante: ");
        System.out.print("Nome: ");
        meuRestaurante.nome = scan.nextLine();
        System.out.print("Endereço: ");
        meuRestaurante.endereco = scan.nextLine();
        System.out.print("CNPJ: ");
        meuRestaurante.cnpj = scan.nextLine();

        System.out.println("Preencha as informaçoes dos fornecedores: ");
        System.out.println("1- Adicionar um novo fornecedor");
        System.out.println("2- Encerrar o processo");

        entrada = scan.nextInt();

        while (entrada != 2) {
            fornecedores[i] = new Fornecedor();
            scan.nextLine();
            System.out.print("Tipo: ");
            fornecedores[i].tipo = scan.nextLine();
            System.out.print("Quantidade: ");
            fornecedores[i].quantidade = scan.nextInt();

            i++;

            System.out.println("Preencha as informaçoes dos fornecedores: ");
            System.out.println("1- Adicionar um novo fornecedor");
            System.out.println("2- Encerrar o processo");

            entrada = scan.nextInt();

        }

        meuRestaurante.fornecedores = fornecedores;
        meuRestaurante.exibirInfos();

    }
}
