package avner1579av3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Livro l1) {

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("arquivoLivros.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Livro");
            bw.newLine();
            bw.write(l1.titulo + "\n");
            bw.write(l1.qtdPaginas + "\n");
            bw.write(l1.editora + "\n");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public ArrayList<Livro> ler() {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer = null;

        ArrayList<Livro> acheiNoArquivo = new ArrayList<>();

        try {

            is = new FileInputStream("arquivoLivros.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null) {
                if (linhaLer.contains("Livro")) {
                    Livro aux = new Livro();
                    aux.titulo = br.readLine();
                    aux.qtdPaginas = Integer.parseInt(br.readLine());
                    aux.editora = br.readLine();
                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {

                System.out.println(e);
            }
        }
        return acheiNoArquivo;
    }
}
