package campominado;

public class Campo {

    int[][] campoMinado = new int[3][3]; //Campo minado
    
    //Posiciona a bomba na Matriz
    void colocaBomba(int posicaoBomba) {

        switch (posicaoBomba) {
            case 1:
                campoMinado[0][0] = 1;
                break;
            case 2:
                campoMinado[0][1] = 1;
                break;
            case 3:
                campoMinado[0][2] = 1;
                break;
            case 4:
                campoMinado[1][0] = 1;
                break;
            case 5:
                campoMinado[1][1] = 1;
                break;
            case 6:
                campoMinado[1][2] = 1;
                break;
            case 7:
                campoMinado[2][0] = 1;
                break;
            case 8:
                campoMinado[2][1] = 1;
                break;
            case 9:
                campoMinado[2][2] = 1;
                break;
        }
    }
    //Checa se a posicçao tem bomba 
    int checaPosicao(int num, Campo matriz) {
        int valor = 0;

        switch (num) {
            case 1:
                valor = matriz.campoMinado[0][0];
                break;
            case 2:
                valor = matriz.campoMinado[0][1];
                break;
            case 3:
                valor = matriz.campoMinado[0][2];
                break;
            case 4:
                valor = matriz.campoMinado[1][0];
                break;
            case 5:
                valor = matriz.campoMinado[1][1];
                break;
            case 6:
                valor = matriz.campoMinado[1][2];
                break;
            case 7: 
                valor = matriz.campoMinado[2][0];
                break;
            case 8:
                valor = matriz.campoMinado[2][1];
                break;
            case 9:
                valor = matriz.campoMinado[2][2];
                break;
        }

        return valor;
    }
}
