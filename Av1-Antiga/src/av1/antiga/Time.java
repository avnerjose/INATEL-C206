package av1.antiga;

public class Time {

    String nome_tecnico;
    String nome_time;
    String modalidade_esportiva;
    int numAtletas;
    Atleta[] atletas = new Atleta[100];

    void adicionaAtleta(Atleta atleta) {
        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i] == null) {
                atletas[i] = atleta;
                break;
            }
        }
    }

    void mostraInfo() {
        System.out.println("Nome do tecnico: " + nome_tecnico);
        System.out.println("Nome do time: " + nome_time);
        System.out.println("Modalidade esportiva: " + modalidade_esportiva);
        System.out.println("---------Atletas do time--------");

        for (Atleta atleta : atletas) {
            if (atleta != null) {
                atleta.mostraInfo();
                System.out.println("---------------------------");
            }
        }

    }

    double mediaPeso(int numAtletas) {
        double soma = 0;
        for (Atleta atleta : atletas) {
            if (atleta != null) {
                soma += atleta.peso;
            }
        }
        return (soma / numAtletas);
    }

    double mediaIdade(int numAtletas) {
        double soma = 0;
        for (Atleta atleta : atletas) {
            if (atleta != null) {
                soma += atleta.idade;
            }
        }
        return (soma / numAtletas);
    }
}
