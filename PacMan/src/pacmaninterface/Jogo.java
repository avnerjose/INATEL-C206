package pacmaninterface;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

public class Jogo {
    
    public int tamanho;//Tamanho do campo do jogo
    private ItemCampo[][] campo = new ItemCampo[40][40];//Campo do jogo
    public Inimigo[] inimigos = new Inimigo[5];//Fantasmas
    public PacMan pac = new PacMan();//Pacman

    Jogo() {//Construtor do Jogo
        //Roda a Intro do Pacman quando o jogo inicia
        File file = new File("src/sounds/pacman-intro.wav");
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException
                | LineUnavailableException | IOException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void colocaSimbolo(int pos, char simbolo) {
        //Posiciona simbolos na matriz
        if (pos != -1) {
            if (inimigos[pos] != null) {
                campo[inimigos[pos].posicaoY][inimigos[pos].posicaoX].simbolo = simbolo;
            }
        } else {
            if (pac != null) {
                campo[pac.posicaoY][pac.posicaoX].simbolo = simbolo;
            }
        }
    }

    boolean checaColisao() {//Checa se um inimigo e o pacman estao na mesma posiçao
        boolean colidiu = false;

        for (int i = 0; i < 4; i++) {//Varifica a colisao 
            if (inimigos[i].posicaoX == pac.posicaoX
                    && inimigos[i].posicaoY == pac.posicaoY) {
                colidiu = true;
            }
        }
        if (colidiu) {
            try {
                Thread.sleep(250);//Aplica um delay
            } catch (InterruptedException e) {
                System.out.println("InterruptedException Exception" + e.getMessage());
            }
        }
        return colidiu;
    }

    public void movePersonagem(int pos) {

        if (checaColisao()) {//Se o pacman esta na mesma posicao que um fantasma
            if (!pac.isInalvejavel()) {
                pac.perdeVida();//Diminui a vida do pacman
                pac.setInalvejavel(true);//Transforma eele em inalvejavel
            }
        }

        if (pos != -1) {//Movimenta os inimigos
            if (!campo[inimigos[pos].posicaoY][inimigos[pos].posicaoX].visitado) {
                colocaSimbolo(pos, '.');
            } else {
                colocaSimbolo(pos, ' ');
            }
            inimigos[pos].moveAleatoriamente(tamanho);
            colocaSimbolo(pos, 'I');
        } else {//Movimenta o Pacman
            colocaSimbolo(pos, ' ');
            pac.moveAleatoriamente(tamanho);
            colocaSimbolo(pos, '©');
            if (!campo[pac.posicaoY][pac.posicaoX].visitado) {
                pac.ganhaPonto();
                campo[pac.posicaoY][pac.posicaoX].visitado = true;
            }
        }

        try {
            Thread.sleep(60);//Aplica um delay 
        } catch (InterruptedException e) {
            System.out.println("InterruptedException Exception" + e.getMessage());
        }
    }

    public void mostraTitulo() {
        System.out.println("*****       *****        ******   *     *    *****    *      *");
        System.out.println("*    **    *     *     **         **   **   *     *   **     *");
        System.out.println("*     **   *     *    *           * * * *   *     *   * *    *");
        System.out.println("*     **   *     *   *            *  *  *   *     *   *  *   *");
        System.out.println("*    **    *******   *            *     *   *******   *   *  *");
        System.out.println("*****      *     *   *            *     *   *     *   *    * *");
        System.out.println("*          *     *    *           *     *   *     *   *     **");
        System.out.println("*          *     *     **         *     *   *     *   *      *");
        System.out.println("*          *     *       ******   *     *   *     *   *      *");
        System.out.println();
        System.out.println("**************************************************************");
    }

    public void iniciaCampo() {

        posicionaPersonagens();//Posiciona os personagens
        for (int i = 0; i < (tamanho / 2); i++) {
            for (int j = 0; j < tamanho; j++) {//Preenche o campo com pontos
                campo[i][j] = new ItemCampo();
                campo[i][j].simbolo = '.';

            }
        }
        colocaSimbolo(-1, '©');//Coloca o pacman no campo
        for (int i = 0; i < inimigos.length; i++) {//Coloca os fantasmas no campo
            if (inimigos[i] != null) {
                colocaSimbolo(i, 'I');
            }
        }
    }

    private void posicionaPersonagens() {//Posisiona os personagens incialmente
        //Coloca o pacman no centro do campo
        pac.posicaoX = (int) (tamanho / 2) - 1;
        pac.posicaoY = (int) (tamanho / 4) - 1;
        pac.cor = "Amarelo";
        //Posiciona os Fantasmas nos cantos do campo
        inimigos[0] = new Inimigo();
        inimigos[0].posicaoX = 0;
        inimigos[0].posicaoY = (tamanho / 2) - 1;
        inimigos[0].cor = "Azul";

        inimigos[1] = new Inimigo();
        inimigos[1].posicaoX = tamanho - 1;
        inimigos[1].posicaoY = (tamanho / 2) - 1;
        inimigos[1].cor = "Azul";

        inimigos[2] = new Inimigo();
        inimigos[2].posicaoX = tamanho - 1;
        inimigos[2].posicaoY = 0;
        inimigos[2].cor = "Azul";

        inimigos[3] = new Inimigo();
        inimigos[3].posicaoX = 0;
        inimigos[3].posicaoY = 0;
        inimigos[3].cor = "Azul";
    }

    public void mostraCampo() {

        for (int i = 0; i < 40; i++) {//usado para "limpar" o terminal
            System.out.println("");
        }
        for (int i = 0; i < (tamanho / 2); i++) {//Mostra as posiçoes do campo
            for (int j = 0; j < tamanho; j++) {
                System.out.print(campo[i][j].simbolo);
            }
            System.out.println("");
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.print("*");
        }
        //Mostra as informaçoes de pontuaao e vida
        System.out.println();
        System.out.println("- 🏳 ️Pontuaçao: " + pac.getPontuacao());
        System.out.println("- ❤️ Vidas: " + pac.getVidas());
        for (int i = 0; i < tamanho; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
