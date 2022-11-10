package rastreadordealunos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class RastreadorDeAlunos {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int computacao = 0;
        int software = 0;
        int biomedica = 0;
        int producao = 0;
        int automacao = 0;
        int telecom = 0;

        String opcao = JOptionPane.showInputDialog(null, "1.Pesquisar | 2.Contar emails");

        if (opcao.equals("1")) {

            String email = JOptionPane.showInputDialog(null, "Entre com seu email");

            try {
                InputStream is = new FileInputStream("emails.txt");
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                boolean achou = false;
                String res = br.readLine();

                while (res != null) {
                    if (res.equals(email)) {
                        achou = true;
                        break;
                    }
                    res = br.readLine();
                }

                if (achou) {
                    JOptionPane.showMessageDialog(null, "Email encontrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Email não encontrado!");
                }
            } catch (Exception ex) {
                System.out.println("Falha ao ler o arquivo");
            }
        } else if (opcao.equals("2")) {
            InputStream is = new FileInputStream("emails.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String res = br.readLine();

            while (res != null) {
                if (res.contains("@gec")) {
                    computacao++;
                } else if (res.contains("@geb")) {
                    biomedica++;
                } else if (res.contains("@ges")) {
                    software++;
                } else if (res.contains("@get")) {
                    telecom++;
                } else if (res.contains("@gea")) {
                    automacao++;
                } else if (res.contains("@gep")) {
                    producao++;
                }
                res = br.readLine();
            }

            JOptionPane.showMessageDialog(null, "Computacao: " + computacao
                    + "\nBiomedica: " + biomedica
                    + "\nSoftware: " + software
                    + "\nTelecom: " + telecom
                    + "\nAutomação: " + automacao
                    + "\nProducao: " + producao);
        }
    }
}
