package carrofeliz;

public class SUV extends Carro {
    private String tracao;
   
    public SUV(double valor,String cor,int ano,String tracao){
        this.setValor(valor);
        this.setCor(cor);
        this.setAno(ano);
        this.tracao = tracao;
    }

    @Override
    public void taxa() {
        this.setValor(this.getValor() + 820); 
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Carro: SUV");
        System.out.println("Valor: " + this.getValor());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Tracao: " + tracao);
    }
}
