package aula11.pkg03.pkg21;

public class Aula110321 {

    public static void main(String[] args) {
        /*
        Conta c1 = new Conta(); 
        Conta c2 = new Conta(); 
        
        c1.numero = 1; 
        c2.numero = 2; 
        
        System.out.println("Numero da conta 1: " + c1.numero);
        System.out.println("Numero da conta 2: " + c2.numero);
        
        c2 = c1;
        
        System.out.println(c2.numero);
        */
        
        Trabalhador trab1 = new Trabalhador(); 
        float ganho; 
        
        trab1.nome = "Avner Jose"; 
        trab1.profissao = "Estudante";
        trab1.salario = 200.00F; 
        trab1.dataNascimento = "25/08/2000"; 
        trab1.rg = "21.215.278-MG";
        
        trab1.mostrandoFuncionario(); 
        ganho = trab1.calculaGanho();
        
        System.out.println("Ganho anual: "  + ganho);
        trab1.recebeAumento(100F);

    }
}
