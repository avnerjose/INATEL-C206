package cofrinhointeligente;

import java.util.ArrayList;
import java.util.Collections;

public class Cofrinho {
    
    ArrayList<Moeda> moedas = new ArrayList<Moeda>();
    
    public void addMoeda(Moeda m) {
        moedas.add(m);
    }
    
    public double getValorTotal() {
        double soma = 0;
        for (Moeda moeda : moedas) {
            soma += moeda.valor;
        }
        return soma;
    }
    
    public int getQuantMoedas() {
        return moedas.size();
    }
    
    public Moeda getMoedaMaiorValor() {
        Moeda m = Collections.max(moedas);
        
        return m;
    }
    
    public void ordenaMoedas() {
        Collections.sort(moedas);
    }

    public ArrayList<Moeda> getMoedas() {
        return moedas;
    }
    
}
