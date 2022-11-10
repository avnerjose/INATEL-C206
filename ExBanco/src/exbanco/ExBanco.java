package exbanco;

import java.util.Scanner;

public class ExBanco {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int cod; 
        double valor; 
        String nome;
        long cpf; 
        Cliente p1 = new Cliente();
        Conta c1; 
        
        System.out.println("Preencha seus dados: ");
        System.out.print("Nome: ");
        nome = scan.nextLine();
        p1.setNome(nome);
        System.out.print("CPF: ");
        cpf = scan.nextLong();
        p1.setCpf(cpf);
        
        c1 = new Conta(p1); 
        
        while(flag){
            System.out.println("================================");
            System.out.println("Digite o codigo desejado: ");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Extrato");
            System.out.println("4 - Sair");
            cod = scan.nextInt(); 
            
            switch(cod){
                case 1:
                    System.out.print("Digite o valor que sera depositado: ");
                    valor = scan.nextDouble();
                    c1.deposita(valor);
                    break; 
                case 2: 
                    System.out.print("Digite o valor que sera sacado: ");
                    valor = scan.nextDouble();
                    c1.saca(valor);
                    break;
                case 3:
                    c1.extrato();
                    break;
                case 4:
                    System.out.println("Saiu!");
                    flag = false; 
                    break; 
            }
            
            
        }
        

    
        
        
        
          
    }
}
