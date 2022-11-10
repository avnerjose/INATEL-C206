package aula12052;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula12052 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta c1 = new Conta();
        String nome;
        int numero;
        double limite;
        double valorAux;

        try {
            System.out.print("Digite seu nome: ");
            nome = scan.nextLine();
            System.out.print("Digite o numero de sua conta: ");
            numero = scan.nextInt();
            System.out.print("Digite o limite de sua conta: ");
            limite = scan.nextDouble();
            System.out.print("Digite o valor que irá ser depositado: ");
            valorAux = scan.nextDouble();

            c1.setNome(nome);
            c1.setNumero(numero);
            c1.setLimite(limite);
            c1.depositar(valorAux);

            System.out.print("Digite o valor que quer sacar: ");
            valorAux = scan.nextDouble();
            c1.sacar(valorAux);
            System.out.println("Novo saldo: " + c1.getSaldo() + " reais.");
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado é inválido!");
        }

    }
}
