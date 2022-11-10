package av1;

import java.util.Scanner;

public class AV1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Scanner para ler a entrada do usuario
        Deck meuDeck = new Deck();//Instancia um novo deck
        int cod;//Codigo que o usuario escolhe no menu
        boolean flag = true;//Flag para o while
        Carta cartaAux;//Carta auxiliar para adicionar uma nova carta ao deck

        //Lendo as informaçoes basicas do deck
        System.out.println("Preencha as informaçoes do seu Deck: ");
        System.out.print("Dono: ");
        meuDeck.dono = scan.nextLine();

        while (flag) {
            //Mostra o menu na tela
            System.out.println("");
            System.out.println("Escolha qual açao pretende fazer: ");
            System.out.println("1- Adicionar uma nova carta ao Deck");
            System.out.println("2- Ver as informaçoes do Deck e suas cartas");
            System.out.println("3- Ver o poder total e a media de poder do Deck");
            System.out.println("4- O numero de cartas de cada categoria");
            System.out.println("5- Sair");

            cod = scan.nextInt();//Le o codigo digitado pelo usuario

            switch (cod) {
                case 1://Adiciona uma nova carta
                    cartaAux = new Carta();//Cria uma nova intancia
                    scan.nextLine();
                    System.out.println("Voce escolheu adicionar uma nova carta!!");
                    System.out.print("Nome: ");
                    cartaAux.nome = scan.nextLine();
                    System.out.print("Poder: ");
                    cartaAux.poder = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Classificacao: ");
                    System.out.println("-Soldado");
                    System.out.println("-Arqueiro");
                    System.out.println("-Pesado");
                    cartaAux.classificacao = scan.nextLine();
                    meuDeck.adicionarCarta(cartaAux);
                    break;
                case 2://Mostra as informaçoes do deck e suas cartas
                    meuDeck.mostraInfo();
                    break;
                case 3: //Mostra o poder total e a media de poder do deck
                    meuDeck.calculaPoderMedio();
                    break;
                case 4: //Mostra quanta cartas de cada classificacao tem no deck
                    meuDeck.calculaClassificacao();
                    break; 
                case 5://Sai do menu
                    System.out.println("Saiu!!");
                    flag = false;
                    break;
                default://Detecta um codigo invalido
                    System.out.println("Favor digitar um valor valido de codigo.");
                    break;
            }
        }

    }
}
