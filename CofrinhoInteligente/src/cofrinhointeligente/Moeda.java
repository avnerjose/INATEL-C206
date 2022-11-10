package cofrinhointeligente;

public class Moeda implements Comparable<Moeda> {

    public float valor;

    public Moeda(float v) {
        this.valor = v;
    }

    @Override
    public int compareTo(Moeda m) {
        return Float.compare(this.valor, m.valor);
    }
}
