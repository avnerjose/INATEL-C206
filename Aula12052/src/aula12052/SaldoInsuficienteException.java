package aula12052;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        System.out.println("Seu saldo é insuficiente para realizar este saque!");
    }
}
