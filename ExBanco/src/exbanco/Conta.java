package exbanco;

public class Conta {
    private static int qtdClientes;
    private double saldo;
    Cliente cliente; 
    
    Conta(Cliente cliente){
        qtdClientes++; 
        this.cliente = cliente; 
    }
    
    void deposita(double valor){
        saldo += valor;
        System.out.println("Valor depositado com sucesso!");
    }
    
    void saca(double valor){
        if(saldo >= valor){
            saldo -=valor; 
            System.out.println("Valor sacado com sucesso!");
        }else
            System.out.println("Saldo insuficiente!");
    }
    
    void extrato(){
        System.out.println("Seu saldo eh: R$" + saldo );
    }

}
