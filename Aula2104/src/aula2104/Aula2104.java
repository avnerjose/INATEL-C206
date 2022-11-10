package aula2104;

public class Aula2104 {

    public static void main(String[] args) {
        Produto n1 = new Notebook("Acer 515",5300,2000,"GeForce 940MX","IntelCore i7");
        Produto c1 = new Camiseta("Camiseta Maneira",34.5,"Laranja","M"); 
        
        
        System.out.println(n1.etiquetaPreco());
        System.out.println("");
        System.out.println(c1.etiquetaPreco());

    }
}
