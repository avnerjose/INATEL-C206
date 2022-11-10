package aula170321;

public class Carro {

    String cor;
    String marca;
    String modelo;
    Motor motor = new Motor(); 
    double velocidadeMax;
    double velocidadeAtual;

    void ligar() {
        System.out.println("O " + modelo + " foi ligado!");
    }

    void acelerar() {
        System.out.println("Acelerando!!!");
    }

    public String toString(){
        String texto;

        texto = "==== Informaçoes do carro ==== \n"
        + "Cor: " + cor + "\nMarca: " + marca
        + "\nModelo: " + modelo + "\nMotor: \n"
        + "  Potencia: " + motor.potencia + "\n  Tipo: "
        + motor.tipo + "\nVelocidade maxima: " + velocidadeMax
        + " Km/h" + "\nVelocidade atual: " + velocidadeAtual + " Km/h";
                
        return texto;
    }

}
