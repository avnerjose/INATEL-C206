package av1.antiga;

import java.util.Scanner;

public class Av1Antiga {
    
    public static void main(String[] args) {
        Time meuTime = new Time();
        Scanner scan = new Scanner(System.in);
        int atletasAdicionados = 0;
        Atleta atletaAux = new Atleta();
        boolean flag = true;
        int operacao;
        
        System.out.println("Preencha as informaçoes do time: ");
        System.out.print("Nome do time: ");
        meuTime.nome_time = scan.nextLine();
        System.out.print("Nome do tecnico: ");
        meuTime.nome_tecnico = scan.nextLine();
        System.out.print("Modalidade esportiva: ");
        meuTime.modalidade_esportiva = scan.nextLine();
        System.out.print("Numero de atletas: ");
        meuTime.numAtletas = scan.nextInt();
        
        while (flag) {
            System.out.println("1- Adicionar um atleta");
            System.out.println("2- Listar atletas cadastrados");
            System.out.println("3- Informaçoes do time e seus atletas");
            System.out.println("4- Media de peso e idade dos atletas");
            System.out.println("5- Sair");
            
            operacao = scan.nextInt();
            
            switch (operacao) {
                case 1:
                    if (atletasAdicionados < meuTime.numAtletas) {
                        scan.nextLine();
                        System.out.print("Nome do atleta: ");
                        atletaAux.nome = scan.nextLine();
                        System.out.print("Idade do atleta: ");
                        atletaAux.idade = scan.nextInt();
                        System.out.print("Peso do atleta: ");
                        atletaAux.peso = scan.nextDouble();
                        meuTime.adicionaAtleta(atletaAux);
                        atletasAdicionados++;
                    } else {
                        System.out.println("Todos os atletas ja foram adicinados!");
                    }
                    break;
                case 2:
                    if (atletasAdicionados > 0) {
                        System.out.println("Atletas cadastrados: ");
                        for (Atleta atleta : meuTime.atletas) {
                            if (atleta != null) {
                                System.out.println("Nome: " + atleta.nome);
                                System.out.println("Idade: " + atleta.idade);
                                System.out.println("Peso: " + atleta.peso + " Kg");
                                System.out.println("-----------------------------");
                            }
                        }
                    } else {
                        System.out.println("Nenhum atleta adicionado ainda");
                    }
                    break;
                case 3:
                    meuTime.mostraInfo();
                    break;
                case 4:
                    if (atletasAdicionados > 0) {
                        System.out.println("Media de peso: " + meuTime.mediaPeso(atletasAdicionados));
                        System.out.println("Media de idade: " + meuTime.mediaIdade(atletasAdicionados));
                    } else {
                        System.out.println("Nenhum atleta adicionado ainda");
                    }
                    break;
                case 5:
                    System.out.println("Saiu!");
                    flag = false;
                    break;
                
            }
        }
    }
}
