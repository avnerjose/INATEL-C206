package cadastrocontrolado;

public class CodigoDesconhecidoException extends RuntimeException {

    public CodigoDesconhecidoException(String codigo) {
        System.out.println("O codigo " + codigo + " é inválido");
    }
}
