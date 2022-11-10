package aula11.pkg03.pkg21;


public class Trabalhador{ 
        
    String nome;
    String profissao; 
    float salario; 
    String rg; 
    String dataNascimento; 
    
    void recebeAumento(float valor){
        salario = salario+valor;
        System.out.println("Novo salario: " + salario);
    }
    
    float calculaGanho(){
        float ganho; 
        
        ganho = salario*13; 
        
        return ganho; 
    }
    
    void mostrandoFuncionario(){
        System.out.println("---- Dados do Funcionario ----");
        System.out.println("Nome: " + nome);
        System.out.println("Profissao: " + profissao);
        System.out.println("Salario: " + salario);
        System.out.println("RG: " + rg);
        System.out.println("Data da nascimento: " + dataNascimento);
    }
    
    
}
