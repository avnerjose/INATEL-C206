
package lucktester;

/**
 *
 * @author avnerjose
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private int numjogadas = 0;//Quantidade de jogadas do jogados
    //Os atributos abaixo foram criados de forma estática para conseguirem
    //Ser acessados em outras partes do projet
    public static NumeroSorteado n1;
    public static NumeroSorteado n2;
    public static NumeroSorteado n3;
    public static int pontuacao;//Pontuação do jogador

    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);//Centraliza a tela no centro 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNum2 = new javax.swing.JLabel();
        labelNum3 = new javax.swing.JLabel();
        labelNum1 = new javax.swing.JLabel();
        labelScore = new javax.swing.JLabel();
        labelNumJogadas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        planodefundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNum2.setFont(new java.awt.Font("Dialog", 1, 54)); // NOI18N
        labelNum2.setForeground(new java.awt.Color(0, 0, 0));
        labelNum2.setText("0");
        getContentPane().add(labelNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 40, 50));

        labelNum3.setFont(new java.awt.Font("Dialog", 1, 54)); // NOI18N
        labelNum3.setForeground(new java.awt.Color(0, 0, 0));
        labelNum3.setText("0");
        getContentPane().add(labelNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 40, 50));

        labelNum1.setFont(new java.awt.Font("Dialog", 1, 54)); // NOI18N
        labelNum1.setForeground(new java.awt.Color(0, 0, 0));
        labelNum1.setText("0");
        getContentPane().add(labelNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 40, 50));

        labelScore.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelScore.setForeground(new java.awt.Color(0, 0, 0));
        labelScore.setText("0");
        getContentPane().add(labelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        labelNumJogadas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelNumJogadas.setForeground(new java.awt.Color(0, 0, 0));
        labelNumJogadas.setText("0");
        getContentPane().add(labelNumJogadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("JOGAR");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        planodefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucktester/maquinaFundo.png"))); // NOI18N
        getContentPane().add(planodefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ThreadChecadora tc = new ThreadChecadora();//Cria uma instancia da thread checadora
        //Cria novas instâncias para cada um dos numeros que serão sorteados
        n1 = new NumeroSorteado();
        n2 = new NumeroSorteado();
        n3 = new NumeroSorteado();

        //Contabiliza mais uma jogada e aplica no Label na tela
        this.numjogadas++;
        this.labelNumJogadas.setText(Integer.toString(this.numjogadas));

        //Configua os objetos das threads
        n1.id = 1;
        n1.label = this.labelNum1;
        n2.id = 2;
        n2.label = this.labelNum2;
        n3.id = 3;
        n3.label = this.labelNum3;
        tc.label = this.labelScore;

        //Inicia todas as threads
        n1.start();
        n2.start();
        n3.start();
        tc.start();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelNum1;
    private javax.swing.JLabel labelNum2;
    private javax.swing.JLabel labelNum3;
    private javax.swing.JLabel labelNumJogadas;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel planodefundo;
    // End of variables declaration//GEN-END:variables
}
