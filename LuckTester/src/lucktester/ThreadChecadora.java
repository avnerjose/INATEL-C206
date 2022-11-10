package lucktester;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadChecadora extends Thread {

    public JLabel label;//Label referente à pontuação na tela
    private boolean fim = false;//Determina se a thread chegou ao fim ou não

    @Override
    public void run() {
        while (!fim) {
            //O método isAlive de uma thread verifica se ela continua ativa
            if (!TelaPrincipal.n1.isAlive()
                    && !TelaPrincipal.n2.isAlive()
                    && !TelaPrincipal.n3.isAlive()) {//Condição para que todas as threads tenham chegado ao fim

                if (TelaPrincipal.n1.numero == TelaPrincipal.n2.numero
                        && TelaPrincipal.n1.numero == TelaPrincipal.n3.numero) {//Se todos forem iguais
                    JOptionPane.showMessageDialog(null, "Você conseguiu 2 pontos nessa jogada :)");
                    TelaPrincipal.pontuacao += 2;
                } else if (TelaPrincipal.n1.numero == TelaPrincipal.n2.numero
                        || TelaPrincipal.n1.numero == TelaPrincipal.n3.numero
                        || TelaPrincipal.n2.numero == TelaPrincipal.n3.numero) {//Se 2 dos 3 numeros forem iguais
                    JOptionPane.showMessageDialog(null, "Você conseguiu 1 ponto nessa jogada :)");
                    TelaPrincipal.pontuacao += 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Você conseguiu 0 pontos nessa jogada :(");
                }
                fim = true;//Encerra o loop
            }
        }
        label.setText(Integer.toString(TelaPrincipal.pontuacao));//Adiciona a pontuação na tela
    }
}
