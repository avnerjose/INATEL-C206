package aula09.pkg03.pkg21;

public class Aula090321 {

    public static void main(String[] args) {

        /*Pessoa Avner = new Pessoa();
        
        Avner.nome = "Avner Jose";
        Avner.idade = 20;
        Avner.peso = 60.5F;
        
        System.out.println(Avner.nome);
        System.out.println(Avner.peso);*/ 
        
        AnimalPET animal1 = new AnimalPET();
        AnimalPET animal2 = new AnimalPET();
           
//        animal1.nome = "Ximango";
//        animal1.especie = "Gato";
//        animal1.comida = "Raçao";
//        animal1.som = "Miado"; 
       // animal1.comer();
       // animal1.dormir(9);
       // animal1.movimentar(20);
       // animal1.fazerBarulho();
        
//        animal2.nome = "Ximango";
//        animal2.especie = "Gato";
//        animal2.comida = "Raçao";
//        animal2.som = "Miado"; 
       // animal1.comer();
       // animal1.dormir(9);
       // animal1.movimentar(20);
       // animal1.fazerBarulho();
       
       animal1 = animal2;
       
       if(animal1 == animal2){
           System.out.println("Iguais");
       }else{
           System.out.println("Diferentes!");
       }
       
        
        
    }
}
