package aula12052;

public class SaqueAcimaDoLimiteException extends Exception {

    public SaqueAcimaDoLimiteException(double limite) {
        System.out.println("Você tentou fazer um saque acima do limite"
                + "de " + limite + " reais! Operação inválida.");
    }

}
