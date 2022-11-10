package pacmaninterface;

public class PacMan extends Personagem {

    private int pontuacao;//Pontuaçao do jogo
    private int vidas;//Numero de vidas do Pacman
    private boolean inalvejavel;//Condiçao para que ele nao possa ser morto

    PacMan() {
        vidas = 3;//Inicia com 3 vidas
        inalvejavel = false;//Começa o jogo nao inalvejavel
    }

    public boolean isInalvejavel() {
        return inalvejavel;
    }

    public void setInalvejavel(boolean inalvejavel) {
        this.inalvejavel = inalvejavel;
    }

    public int getVidas() {
        return vidas;
    }
    
    public int getPontuacao() {
        return pontuacao;
    }

    public void perdeVida() {
        vidas--;
    }

    public void ganhaPonto() {
        pontuacao++;
    }

}
