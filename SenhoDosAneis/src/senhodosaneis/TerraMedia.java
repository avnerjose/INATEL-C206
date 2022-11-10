package senhodosaneis;

public class TerraMedia {

    Habitante[] herois = new Habitante[50];

    public void addHabitante(Habitante habitante) {
        for (int i = 0;i<herois.length;i++) {
            if (herois[i] == null) {
                herois[i] = habitante;
                break;
            }
        }
    }

    public void ListarHabitantes() {
        for (Habitante heroi : herois) {
            if (heroi != null) {
                if (heroi instanceof Anao) {
                    Anao aux = (Anao) heroi;
                    aux.atacar();
                    aux.minerar();
                } else if (heroi instanceof Elfo) {
                    Elfo aux = (Elfo) heroi;
                    aux.atacar();
                    aux.curar();
                    aux.viajar();    
                }else if(heroi instanceof Mago){
                    Mago aux = (Mago) heroi;
                    aux.atacar();
                    aux.curar();
                    aux.lancaFeitico();
                }
                heroi.mostraInfo();
                System.out.println("**********************");
            }
        }
    }
}
