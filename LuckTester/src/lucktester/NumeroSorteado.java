package lucktester;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class NumeroSorteado extends Thread {

    public int id;//Identificador de cada numero
    public int numero = 0;//Valor do numero sorteado
    public JLabel label;//Label referente ao numero especifico na tela

    @Override
    public void run() {
        Random r = new Random();//Numero aleatorio

        this.numero = r.nextInt(5) + 1;//Pega um valor aleatório entre 1 e 5
        
        try {//Aplica um delay específico para cada ID para ter um efeito sequencial na máquina
            Thread.sleep(id * 100);
        } catch (InterruptedException ex) {
            Logger.getLogger(NumeroSorteado.class.getName()).log(Level.SEVERE, null, ex);
        }
        label.setText(Integer.toString(this.numero));//Aplica o valor aleatório calculado no label na tela 
    }
}
