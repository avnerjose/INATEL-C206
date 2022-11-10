package avner1579av3;

import javax.swing.JOptionPane;

public class CampoVazioException extends Exception {
    
    public CampoVazioException(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
