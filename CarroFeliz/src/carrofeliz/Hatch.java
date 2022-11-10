package carrofeliz;

public class Hatch extends Carro {

    private int portas;

    public Hatch(double valor, String cor, int ano, int portas) {
        this.setValor(valor);
        this.setCor(cor);
        this.setAno(ano);
        this.portas = portas;
    }

    @Override
    public void taxa() {
        this.setValor(this.getValor() + 600); 
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Carro: Hatch");
        System.out.println("Valor: " + this.getValor());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Portas: " + portas);
    }
}
