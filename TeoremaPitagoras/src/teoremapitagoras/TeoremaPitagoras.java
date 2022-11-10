package teoremapitagoras;

import javax.swing.JOptionPane;

public class TeoremaPitagoras {

    public static void main(String[] args) {
        double distancia;//Distancia entre os dois pontos
        Ponto p1 = new Ponto();//Ponto 1
        Ponto p2 = new Ponto();//Ponto 2
        Ponto pmedio = new Ponto();//Ponto médio

        try {
            //Leitura de dados po JOptionPane
            p1.x = Integer.parseInt(JOptionPane.showInputDialog("X1: "));
            p1.y = Integer.parseInt(JOptionPane.showInputDialog("Y1: "));
            p2.x = Integer.parseInt(JOptionPane.showInputDialog("X2: "));
            p2.y = Integer.parseInt(JOptionPane.showInputDialog("Y2: "));

            //Calculo da distancia atravéz de pitágoras
            distancia = Math.sqrt(
                    Math.pow(p2.x - p1.x, 2)
                    + Math.pow(p2.y - p1.y, 2));

            //Calculo do ponto médio 
            pmedio.x = Math.round((p1.x + p2.x) / 2);
            pmedio.y = Math.round((p1.y + p2.y) / 2);

            //Saída de dados com JOptionPane
            JOptionPane.showMessageDialog(null, "Distancia entre os dois pontos: "
                    + distancia + "\nPonto médio: " + "\nX: " + pmedio.x
                    + "\nY: " + pmedio.y);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor digitado é incorreto");
        }

    }
}
