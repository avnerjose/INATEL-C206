package redessociais;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez uma video conferencia no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicaçao no GooglePlus");
    }

}
