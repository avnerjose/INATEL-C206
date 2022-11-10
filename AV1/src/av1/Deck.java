package av1;

public class Deck {

    String dono;
    Carta[] cartas = new Carta[100];

    void adicionarCarta(Carta carta) {
        //Percorre o vetor e adiciona uma carta na proxima posicao com null
        for (int i = 0; i < cartas.length; i++) { 
            if (cartas[i] == null) {
                cartas[i] = carta;
                break;
            }
        }
    }

    void mostraInfo() {
        int i = 1;
        System.out.println("======= Informaçoes do Deck ========");
        System.out.println("Dono: " + dono);
        System.out.println("Cartas: ");

        for (Carta carta : cartas) {//Mostra as informaçoes das cartas preenchidas
            if (carta != null) {
                System.out.println("--------------------------------------");
                System.out.println("Carta: " + i);
                System.out.println("Nome: " + carta.nome);
                System.out.println("Poder: " + carta.poder);
                System.out.println("Classificacao: " + carta.classificacao);
                i++;
            }

        }
    }

    void calculaPoderMedio() {
        int poderTotal = 0;
        int numCartas = 0;
        double media;
        
        for (Carta carta : cartas) {
            if (carta != null) {
                numCartas++;//Conta quantas cartas tem no deck
                poderTotal += carta.poder;//Calcula o poder total do deck
            }
        }
        media =(double)poderTotal / numCartas;
        System.out.println("Poder total do deck: " + poderTotal);
        System.out.println("Media de poder: " + media);
    }

    void calculaClassificacao() {
        int arqueiro = 0; 
        int soldado = 0;
        int pesado = 0; 
        
        for (Carta carta: cartas) {
            if(carta != null){
                if(carta.classificacao.toLowerCase().equals("arqueiro")){
                    arqueiro++; 
                }
                else if(carta.classificacao.toLowerCase().equals("soldado")){
                    soldado++; 
                }
                else if(carta.classificacao.toLowerCase().equals("pesado")){
                    pesado++; 
                }
            
            }
        }
        
        System.out.println("------Classificaçoes das cartas do Deck------");
        System.out.println("- " + arqueiro + " Arqueiros");
        System.out.println("- " + soldado + " Soldados");
        System.out.println("- " + pesado + " Pesados");
        
    }
}
