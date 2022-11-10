package excal;

import java.util.Scanner;

public class ExCal {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        double raio; 
        
        System.out.print("Digite o valor do raio: ");
        raio = scan.nextDouble(); 
        
        System.out.println("Area da circumferencia: " + Calculadora.circumferencia(raio));
        System.out.println("Volume da esfera: " + Calculadora.volume(raio));
              
    }
}
