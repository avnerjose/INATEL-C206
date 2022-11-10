package aula1205;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula1205 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1 = 0;
        int val2 = 0;
        int op = 0;
        
        try{
            System.out.print("Digite o primeiro numero: ");
            val1 = scan.nextInt();
            System.out.print("Digite o segundo numero: ");
            val2 = scan.nextInt();
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.print("Digite a operação: ");
            op = scan.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Valor digitado incorreto!");
        }
        
        switch(op){
            case 1:
                System.out.println("Soma: " + (val1 + val2));
                break;
            case 2:
                System.out.println("Subtracao: " + (val1-val2));
                break;
            case 3:
                try{
                System.out.println("Divisão: " + (val1/val2));
                }catch(ArithmeticException e){
                    System.out.println("Operação inválida, divisão por zero!");
                }
                break;
            case 4:
                System.out.println("Multiplicação: " +(val1*val2));
                break;
            default: 
                System.out.println("Operação inexistente!");
                break;
        }
        
        
        
        
    }
}
