package campominado;

import java.util.Random;
import java.util.Scanner;

public class CampoMinado {

    public static void main(String[] args) {
        Campo campoMinado = new Campo();//Cria um campo minado
        Scanner scan = new Scanner(System.in);//Cria um objeto do tipo scan
        int tentativas = 0;//Conta as tentativas do jogador
        Random randomGenerator = new Random();//Cria um objeto da classe Random
        int posicaoBomba;//Posicao em que a bomba sera colocada
        int entrada;//Entrada do usuario

        //Calcula de forma aleatoria a posicao da bomba
        posicaoBomba = randomGenerator.nextInt(9) + 1;

        //Coloca a bomba no campo
        campoMinado.colocaBomba(posicaoBomba);
        
        //Pede uma posiçao ao usuario
        System.out.println("Digite a posiçao");
        entrada = scan.nextInt();
        
        while (tentativas != 8) {

            tentativas++;
            //Verifica se explobiu
            if (campoMinado.checaPosicao(entrada, campoMinado) == 1) {
                System.out.println("BOOOOM! X( GAME OVER!");
                break;
            } else {
                //Verifica se ganhou o jogo
                if (tentativas == 8) {
                    System.out.println("Parabens voce ZEROU o jogo!");
                    break;
                } 
                //Verifica se escolheu uma posiçao sem bomba
                else {
                    System.out.println("Muito Bom! X)");
                }
            }
            System.out.println("Digite a posiçao");
            entrada = scan.nextInt();
        }
        //Mostra o campo minado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(campoMinado.campoMinado[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
