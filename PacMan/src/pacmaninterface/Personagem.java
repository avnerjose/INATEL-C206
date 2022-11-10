package pacmaninterface;

import java.util.Random;

public abstract class Personagem implements Movel {
    
    protected String cor; //Cor do personagem
    protected int posicaoX; //Posiçao na matriz
    protected int posicaoY; //Posicao na matriz

    @Override
    public void movePraCima(int tam) {
      
        if((posicaoY + 1) > (tam/2)-1){//Checa se esta fora do campo
            moveAleatoriamente(tam); 
        }else{
            posicaoY++;
        } 
    }

    @Override
    public void movePraBaixo(int tam) {
       
        if((posicaoY-1)<0){//Checa se esta fora do campo
            moveAleatoriamente(tam); 
        }else{
            posicaoY--; 
        }
    }

    @Override
    public void movePraDireita(int tam) {
        
        if((posicaoX + 1) > tam-1){//Checa se esta fora do campo
            moveAleatoriamente(tam); 
        }else{
            posicaoX++; 
        } 
    }

    @Override
    public void movePraEsquerda(int tam) {
        
        if((posicaoX - 1)<0){//Checa se esta fora do campo
            moveAleatoriamente(tam); 
        }else{ 
            posicaoX--; 
        }
    }
    //Sorteia um valor entre 0 e 3 para mover o personagem aleatoriamente
    public void moveAleatoriamente(int tam){
        Random generator = new Random();
        int valor; 
        
        valor = generator.nextInt(4); 

        switch(valor){
            case 0:
                movePraCima(tam); 
                break; 
            case 1:
                movePraBaixo(tam); 
                break; 
            case 2:
                movePraDireita(tam); 
                break; 
            case 3:
                movePraEsquerda(tam); 
                break; 
        }
    }
    
}
