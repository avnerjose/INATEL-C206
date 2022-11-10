package pacmaninterface;

import java.util.Scanner;

public class PacManInterface {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();//Instancia um novo jogo
        Scanner scan = new Scanner(System.in);//Cria um objeto pra ler o teclado
        boolean flag = true;//Flag para determinar a parada do while
        int n;//Quantidade de vezes que os fantasmas vao andar quando o pacman perder vida

        n = 3;
        jogo.mostraTitulo();//Mostra o titulo do jogo

        do {//Define o tamanho da tabuleiro de acordo com a entrada do usuario
            System.out.print("Digite o tamanho do tabuleiro (10-40): ");
            jogo.tamanho = scan.nextInt();
        } while (jogo.tamanho < 10 || jogo.tamanho > 40);

        jogo.iniciaCampo();//Inicia o jogo
        while (flag) {
            for (int i = 0; i < 5; i++) {
                if (i != 4) {
                    jogo.movePersonagem(i);//Move os fantasmas
                } else {
                    if (!jogo.pac.isInalvejavel()) {//Condiçao para o pacman nao ter perdido vida
                        jogo.movePersonagem(-1);//Move o Pacman
                    } else {//Quando o pacman perdeu vida
                        n--;//Decrementa o quanto de vezes os fantasmas devem mover
                        if (n == 0) {
                            jogo.pac.setInalvejavel(false);//Reseta o pacman
                            n = 3;
                        } else {
                            for (int j = 0; j < 4; j++) {
                                jogo.movePersonagem(j);//Move os fantasmas
                            }
                        }
                    }
                }
                jogo.mostraCampo();//Mostra a matrix toda vez que o while roda
            }
            if (jogo.pac.getVidas() == 0 || jogo.pac.getPontuacao() == ((int) (Math.pow(jogo.tamanho, 2) / 2))) {
                flag = false;//Condiçoes para o jogo ter terminado
            }
        }
        System.out.println("GAME OVER!!");
    }
}
