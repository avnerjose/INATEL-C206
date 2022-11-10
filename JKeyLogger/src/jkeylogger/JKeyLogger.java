package jkeylogger;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class JKeyLogger {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        PrintStream ps = new PrintStream("log.txt");
        String[] palavrasChave = {"roubo",
            "sequestro", "assassinato", "drogas",
            "assalto", "suicídio", "bomba", "terrorismo", "armas", "corrupção", "perigo",
            "ameaça"};

        boolean captura = false;

        while (scan.hasNextLine()) {
            String texto = scan.nextLine();

            for (int i = 0; i < palavrasChave.length; i++) {
                if (texto.contains(palavrasChave[i])) {
                    captura = true;
                }
            }

            if (captura) {
                ps.println(texto);
            }

        }
    }

}
