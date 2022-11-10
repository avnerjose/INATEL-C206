package cadastrocontrolado;

public class Cadastro {

    public String[] codigosValidos = new String[100];
    public String[] codigosInvalidos = new String[100];

    public void addCodigo(String codigo) {
        if (codigo.length() == 7
                && (codigo.startsWith("mp-")
                || codigo.startsWith("dp-")
                || codigo.startsWith("bp-"))) {

            for (int i = 0; i < codigosValidos.length; i++) {
                if (codigosValidos[i] == null) {
                    codigosValidos[i] = codigo;
                    break;
                }
            }

        } else {
            try {
                throw new CodigoDesconhecidoException(codigo);
            } catch (CodigoDesconhecidoException e) {

                for (int i = 0; i < codigosInvalidos.length; i++) {
                    if (codigosInvalidos[i] == null) {
                        codigosInvalidos[i] = codigo;
                        break;
                    }
                }
            }
        }
    }

    public void mostrCodigos() {

        if (codigosValidos[0] != null) {
            System.out.println("Códigos válidos: ");
            for (String codValido : codigosValidos) {
                if (codValido != null) {
                    System.out.println("- " + codValido);
                }
            }
        } else {
            System.out.println("Nenhum código válido encontrado!");
        }

        if (codigosInvalidos[0] != null) {
            System.out.println("Códigos inválidos: ");
            for (String codInvalido : codigosInvalidos) {
                if (codInvalido != null) {
                    System.out.println("- " + codInvalido);
                }
            }
        } else {
            System.out.println("Nenhum código inválido encontrado!");
        }

    }
}
