package exercicio1array;

import java.util.Scanner;

public class Exercicio1Array {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[100];
        Carrinho myCart = new Carrinho();
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int entrada;

        System.out.println("1-Adicionar um novo produto");
        System.out.println("2-Encerrar processo");
        entrada = scan.nextInt();

        while (entrada != 2) {
            produtos[i] = new Produto();
            scan.nextLine();
            System.out.print("Nome do produto: ");
            produtos[i].nome = scan.nextLine();
            System.out.print("Descriçao: ");
            produtos[i].descricao = scan.nextLine();
            System.out.print("Fabricante: ");
            produtos[i].fabricante = scan.nextLine();
            System.out.print("Preço: ");
            produtos[i].preco = scan.nextDouble();

            i++;

            System.out.println("1-Adicionar um novo produto");
            System.out.println("2-Encerrar processo");
            entrada = scan.nextInt();
        }

        myCart.produtos = produtos;
        myCart.exibirInfo();
        
        System.out.println("Total da compra: R$ " +  myCart.calculaTotal());
       
    }
}
