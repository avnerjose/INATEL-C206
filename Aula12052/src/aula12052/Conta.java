package aula12052;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    public void depositar(double valor) {
        System.out.println("Você depositou " + valor + " reais na sua conta");
        saldo += valor;
    }

    public void sacar(double valor) {
        try {
            if (valor > saldo) {
                throw new SaldoInsuficienteException();
            } else if (valor > limite) {
                throw new SaqueAcimaDoLimiteException(valor);
            }
            System.out.println("Saque realizado com sucesso!");
            saldo -= valor;
        } catch (SaldoInsuficienteException e) {
            System.out.println("Exceção: SaldoInsuficienteException");
        } catch (SaqueAcimaDoLimiteException e) {
             System.out.println("Exceção: SaqueAcimaDoLimiteException");
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

}
