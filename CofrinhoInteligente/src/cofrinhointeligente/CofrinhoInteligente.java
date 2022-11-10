package cofrinhointeligente;

public class CofrinhoInteligente {

    public static void main(String[] args) {
        Cofrinho c1 = new Cofrinho();
        Moeda m1 = new Moeda(0.5F);
        Moeda m2 = new Moeda(0.1F);
        Moeda m3 = new Moeda(0.25F);
        Moeda m4 = new Moeda(1F);
        Moeda m5 = new Moeda(0.1F);
        Moeda m6 = new Moeda(1F);
        Moeda m7 = new Moeda(1F);

        c1.addMoeda(m1);
        c1.addMoeda(m2);
        c1.addMoeda(m3);
        c1.addMoeda(m4);
        c1.addMoeda(m5);
        c1.addMoeda(m6);
        c1.addMoeda(m7);

        System.out.println("Moeda de maior valor: R$ " + c1.getMoedaMaiorValor().valor);
        System.out.println("Quantidade de moedas no cofre " + c1.getQuantMoedas());
        System.out.println("Valor total no cofre: R$ " + c1.getValorTotal());
        c1.ordenaMoedas();
        System.out.println("******* Moedas ordenadas *******");
        for (int i = 0; i < c1.getMoedas().size(); i++) {
            System.out.print("Moeda " + (i + 1) + ": R$ ");
            System.out.println(c1.getMoedas().get(i).valor);
        }

    }
}
