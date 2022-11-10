package javazoo;

public class JavaZoo {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        zoo.setNome("Zoologico super do bem");
        zoo.setEndereco("Rua dos bobos, 0");

        Coruja c1 = new Coruja();
        c1.nome = "Edwiges";
        c1.nPatas = 2;
        c1.cor = "Branco";
        c1.setAlturaVoo(300);

        Peixe p1 = new Peixe();
        p1.nome = "Nemo";
        p1.cor = "Laranja";
        p1.nPatas = 0;
        p1.setnBarbatanas(3);

        Leao l1 = new Leao();
        l1.nome = "Aslan";
        l1.cor = "Bege";
        l1.nPatas = 4;
        l1.setTamanhoJuba(0.35F);

        Pato p2 = new Pato();
        p2.nome = "Patolino";
        p2.cor = "Preto";
        p2.nPatas = 2;
        p2.setTamanhoBico(0.24F);

        Animal[] animalAux = new Animal[100];

        animalAux[0] = c1;
        animalAux[1] = p1;
        animalAux[2] = l1;
        animalAux[3] = p2;

        zoo.setAnimais(animalAux);

        System.out.println("Informaçoes do zoologico: ");
        System.out.println("Nome: " + zoo.getNome());
        System.out.println("Endereco: " + zoo.getEndereco());

        for (int i = 0; i < zoo.getAnimais().length; i++) {
            if (zoo.getAnimais()[i] != null) {
                System.out.println("Animal: " + (i + 1));
                System.out.println("Nome: " + zoo.getAnimais()[i].nome);
                System.out.println("Cor: " + zoo.getAnimais()[i].cor);
                System.out.println("Numero de patas: " + zoo.getAnimais()[i].nPatas);

                if (zoo.getAnimais()[i] instanceof Coruja) {
                    Coruja aux = (Coruja) zoo.getAnimais()[i];

                    System.out.println("Altura do voo: " + aux.getAlturaVoo());
                    aux.fazBarulho();
                } else if (zoo.getAnimais()[i] instanceof Peixe) {
                    Peixe aux = (Peixe) zoo.getAnimais()[i];

                    System.out.println("Numero de barbatanas: " + aux.getnBarbatanas());
                    aux.fazBarulho();
                } else if (zoo.getAnimais()[i] instanceof Leao) {
                    Leao aux = (Leao) zoo.getAnimais()[i];

                    System.out.println("Tamanho da juba: " + aux.getTamanhoJuba());
                    aux.fazBarulho();
                } else if (zoo.getAnimais()[i] instanceof Pato) {
                    Pato aux = (Pato) zoo.getAnimais()[i];

                    System.out.println("Tamanho do bico: " + aux.getTamanhoBico());
                    aux.fazBarulho();   
                }
                System.out.println("");
            }
        }

    }
}
