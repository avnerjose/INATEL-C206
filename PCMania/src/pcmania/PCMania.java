package pcmania;

import java.util.Scanner;

public class PCMania {

    public static void main(String[] args) {
        //Criando Objetos do tipo Computador
        Computador comp1 = new Computador();
        Computador comp2 = new Computador();
        Computador comp3 = new Computador();
        //Criando objetos do tipo MemoriaUSB
        MemoriaUSB musb1 = new MemoriaUSB();
        MemoriaUSB musb2 = new MemoriaUSB();
        MemoriaUSB musb3 = new MemoriaUSB();
        //Cria um objeto do tipo cliente
        Cliente cliente = new Cliente();
        //Cria um array de referencias de Computadores que serao compradas pelo cliente
        Computador[] compras = new Computador[100];
        //Cria um objeto do tipo Scanner
        Scanner scan = new Scanner(System.in);
        float totalCompra; // Total da compra
        int entrada;//Valor entrado pelo usuario
        int i = 0;//Varavel contaor
        
        //Preenchendo os objestos do tipo Computador
        comp1.hardwares[0] = new HardwareBasico();
        comp1.hardwares[1] = new HardwareBasico();
        comp1.hardwares[2] = new HardwareBasico();
        comp1.marca = "Positivo";
        comp1.preco = 1300F;
        comp1.hardwares[0].nome = "Processador Core i3";
        comp1.hardwares[0].capacidade = 1200;
        comp1.hardwares[1].nome = "Memoria RAM";
        comp1.hardwares[1].capacidade = 4;
        comp1.hardwares[2].nome = "HD";
        comp1.hardwares[2].capacidade = 500;
        comp1.sistema.nome = "Linux Ubuntu";
        comp1.sistema.tipo = 32;
        musb1.nome = "Pen-drive";
        musb1.capacidade = 16;
        comp1.addMemoriaUSB(musb1);

        comp2.hardwares[0] = new HardwareBasico();
        comp2.hardwares[1] = new HardwareBasico();
        comp2.hardwares[2] = new HardwareBasico();
        comp2.marca = "Acer";
        comp2.preco = 1800F;
        comp2.hardwares[0].nome = "Processador Core i5";
        comp2.hardwares[0].capacidade = 2260;
        comp2.hardwares[1].nome = "Memoria RAM";
        comp2.hardwares[1].capacidade = 8;
        comp2.hardwares[2].nome = "HD";
        comp2.hardwares[2].capacidade = 1000;
        comp2.sistema.nome = "Windows 8";
        comp2.sistema.tipo = 64;
        musb2.nome = "Pen-drive";
        musb2.capacidade = 32;
        comp2.addMemoriaUSB(musb2);

        comp3.hardwares[0] = new HardwareBasico();
        comp3.hardwares[1] = new HardwareBasico();
        comp3.hardwares[2] = new HardwareBasico();
        comp3.marca = "Vaio";
        comp3.preco = 2800F;
        comp3.hardwares[0].nome = "Processador Core i7";
        comp3.hardwares[0].capacidade = 3500;
        comp3.hardwares[1].nome = "Memoria RAM";
        comp3.hardwares[1].capacidade = 16;
        comp3.hardwares[2].nome = "HD";
        comp3.hardwares[2].capacidade = 2000;
        comp3.sistema.nome = "Windows 10";
        comp3.sistema.tipo = 64;
        musb3.nome = "HD Externo";
        musb3.capacidade = 1000;
        comp3.addMemoriaUSB(musb3);
        
        
        //Pedindo as informaçoes do usuario
        System.out.println("Digite suas informaçoes pessoais: ");
        System.out.print("Nome: ");
        cliente.nome = scan.nextLine();
        System.out.print("CPF: ");
        cliente.cpf = scan.nextLong();

        do {
            //Saida de dados
            System.out.println("Favor digitar o codigo desejado: ");
            System.out.println(" 0 - Sair");
            System.out.println(" 1 - Promoçao 1");
            System.out.println(" 2 - Promoçao 2");
            System.out.println(" 3 - Promoçao 3");

            entrada = scan.nextInt(); //Le o valor digitado pelo usuario 
            compras[i] = new Computador();//Instancia um novo objeto no array

            if (entrada == 0) { //Caso em que a pessoa encerra a compra 
                compras[i] = null;//Deleta o objeto do array que nao sera usado
                break;// Sai da repetiçao
            }
            
            //Adiciona um computador nas compras de acordo com a entrada
            switch (entrada){
                case 1:
                    compras[i] = comp1;
                    break;
                case 2:
                    compras[i] = comp2;
                    break;
                case 3:
                    compras[i] = comp3;
                    break;
            }

            i++;

        } while (entrada != 0);

        cliente.compras = compras; //Coloca o array de compras dentro das compras do cliente
        totalCompra = cliente.calculaTotalCompra();//Chama o metodo para calcular o total
        
        //Mostra os dados da compra
        System.out.println("Dados do usuario: ");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);

        if (cliente.compras[0] != null) {
            System.out.println("========= Dados das Compras ========");
        }
        for (int j = 0; j < cliente.compras.length; j++) {
            if (cliente.compras[j] != null) {
                System.out.println(j + 1 + ":");
                cliente.compras[j].mostraPCConfigs();
            }
        }

        System.out.println("------------------------------------");

        System.out.println("Total da compra: R$ " + totalCompra);

    }
}
