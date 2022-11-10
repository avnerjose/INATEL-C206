package carrofeliz;

public class Sedan extends Carro{
    private int portaMalas;
    
    public Sedan(double valor,String cor,int ano,int portaMalas){
        this.setValor(valor);
        this.setCor(cor);
        this.setAno(ano);
        this.portaMalas = portaMalas;
    }

    @Override
    public void taxa() {
        this.setValor(this.getValor() + 350); 
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Carro: Sedan");
        System.out.println("Valor: " + this.getValor());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Porta Malas: " + portaMalas);
    }
}
