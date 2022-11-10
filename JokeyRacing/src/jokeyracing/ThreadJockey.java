package jokeyracing;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadJockey extends Thread{
    JLabel label;
    JFrame pista;
    int id;
    boolean fim = false;
    
    @Override
    public void run(){
        Random r =new Random();
        
        while(!fim){
            int n = r.nextInt(6);
            
            if(label.getX()+170 < pista.getWidth()){
                label.setLocation(label.getX()+n,label.getY());
                pista.repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadJockey.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                fim = true;
            }
        }
        
        JOptionPane.showMessageDialog(pista,"O Jockey de numero " + id + " chegou!");
    }
}
