package aula09.pkg03.pkg21;


public class AnimalPET {
    String nome;
    String especie;
    String som;
    String comida;
    int idade;
    
    void comer(){
        System.out.println(nome+" esta comendo");
    }
    
    void dormir(int horas){
        System.out.println(nome + " dormiu por " + horas + " horas.");
    }
    
    void movimentar(int metros){
        System.out.println(nome + " se movimentou por " + metros + " metros.");
    }
    
    void fazerBarulho(){
        System.out.println(nome + " esta fazendo barulho, alguem acalma esse bicho");
    }
    
    
}
