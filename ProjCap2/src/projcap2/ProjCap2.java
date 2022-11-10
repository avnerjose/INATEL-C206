package projcap2;

import java.util.Random;
import java.util.Scanner;

public class ProjCap2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /* 
        int valores[] = new int[3];
        int soma = 0;
        double media; 
        
        for (int i = 0; i < 3; i++) {
            valores[i] = scan.nextInt();
            soma += valores[i]; 
        }
        media = soma/3; 
        System.out.println(soma);
        System.out.println(media);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(valores[i]);
        }*/

 /* System.out.print("Digite o valor da NPA: ");
       double NPA = scan.nextDouble();
       
       if(NPA >= 60){
           System.out.println("Aluno aprovado");
       }
       else if(NPA <30){
           System.out.println("Aluno reprovado");
       }
       else{
           System.out.print("Digite o valor da NP3: ");
           double NP3 = scan.nextDouble(); 
           double mediafinal;
           
           mediafinal = (NP3+NPA)/2; 
           
           System.out.println("Media final: " + mediafinal);
           
           if(mediafinal >= 50){
               System.out.println("Aluno aprovado");
           }
           else{
               System.out.println("Aluno reprovado");
           }
           
       } */
 /* System.out.print("Digite um elemental: ");
        String elemental = scan.nextLine();
        elemental = elemental.toLowerCase(); 
        
        System.out.println("A fraqueza eh: ");

        switch (elemental) {
            
            case "fogo":
                System.out.println("Agua");
                break;
            case "agua":
                System.out.println("Eletricidade");
                break;
            case "eletricidade":
                System.out.println("Pedra");
                break;
            case "pedra":
                System.out.println("Gelo");
                break;
            case "gelo":
                System.out.println("Fogo");
                break;
            case "planta":
                System.out.println("Fogo");
                break;
            default:
                System.out.println("Elemental desconhecido.");
                break;

        }*/
 
        /*
        Random randomGenerator = new Random();

        int numAleatorio = randomGenerator.nextInt(10) + 1;
        System.out.print("Digite um numero: ");
        int num = scan.nextInt();
        int tentativas = 0;
        while (num != numAleatorio) {
            
            tentativas++;
            
            System.out.print("Digite um numero: ");
            num = scan.nextInt();   
        }
        
        System.out.println("Parabens! Vc acertou depois de " + tentativas + " tentativas");
        */
        
        System.out.print("Digite o numero para calcular a tabuada: ");
        int tabuada = scan.nextInt(); 
        System.out.print("Digite o numerod de inicio da tabuada: ");
        int inicio = scan.nextInt();
        System.out.print("Digite o numero de fim da tabuada: ");
        int fim = scan.nextInt(); 
        
        for (int i = inicio; i < fim; i++) {
            System.out.println(tabuada + " * " + i + " = " + (tabuada*i));
        }
    }
}
