package aula170321;

public class Aula170321 {

    public static void main(String[] args) {
        Carro fusca = new Carro();
        Carro celta = new Carro();
        String info;

        fusca.cor = "Bege";
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.motor.potencia = "65 cv";
        fusca.motor.tipo = "4 cilindros";
        fusca.velocidadeMax = 110.5F;
        fusca.velocidadeAtual = 50F;

        fusca.ligar();
        fusca.acelerar();
        info = fusca.toString();

        System.out.println(info);
        System.out.println("\n");

        celta.cor = "Branco";
        celta.marca = "Chevrolet";
        celta.modelo = "Celta";
        celta.motor.potencia = "78 cv";
        celta.motor.tipo = "4 cilindros";
        celta.velocidadeMax = 161F;
        celta.velocidadeAtual = 70F;

        celta.ligar();
        celta.acelerar();
        info = celta.toString();

        System.out.println(info);

    }
}
