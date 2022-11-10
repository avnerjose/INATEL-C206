package cadastrocontrolado;

public class CadastroControlado {

    public static void main(String[] args) {

        Cadastro c1 = new Cadastro();

        c1.addCodigo("mp-3424");
        c1.addCodigo("ab-12eq");
        c1.addCodigo("do-ad3d");
        c1.addCodigo("bp-adsffasdf");
        c1.addCodigo("dp-213d");
        c1.addCodigo("bp-adsf");

        c1.mostrCodigos();
    }
}
