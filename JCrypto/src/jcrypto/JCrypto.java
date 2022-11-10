package jcrypto;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

public class JCrypto {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String entrada
                = JOptionPane.showInputDialog(null, "Entre com a frase que quer criptografar");
        String chave = JOptionPane.showInputDialog(null, "Entre com a chave da criptografia");

        OutputStream os = new FileOutputStream("arquivo.txt", true);
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);
        bw.newLine();
        for (int i = 0; i < entrada.length(); i++) {
            int aux = (int) entrada.charAt(i);
            aux = aux - Integer.parseInt(chave);
            System.out.println((char) aux);
            bw.write((char) aux);
        }

        bw.close();

    }
}
