package senhodosaneis;

public class SenhoDosAneis {

    public static void main(String[] args) {
        TerraMedia terraMedia = new TerraMedia();
        Arma a1 = new Arma("Mjonor - Machado",false);
        Arma a2 = new Arma("Arquerides - Arco e flecha", false);
        Arma a3 = new Arma("Batucduc - Cajado", true);
        Anao a = new Anao("Gimli",230,400,1.2F,"Moria",a1);
        Elfo e = new Elfo("Legolas",620,600,"Lothlórien",a2); 
        Mago m = new Mago("Gandalf",4000,890,"Cinzento",a3);
        
        terraMedia.addHabitante(a);
        terraMedia.addHabitante(e);
        terraMedia.addHabitante(m);
        
        terraMedia.ListarHabitantes();
    }
}
