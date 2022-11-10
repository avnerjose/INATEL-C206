package carrofeliz;

public class CarroFeliz {

    public static void main(String[] args) {
        Carro [] carros = new Carro[3];
        
        carros[0] = new SUV(120000,"Preto",2015,"4x4");
        carros[1] = new Sedan(58600,"Prata",2017,445);
        carros[2] = new Hatch(40000,"Vermelho",2019,3);
        
        for (int i = 0; i < 3; i++) {
            carros[i].taxa();
            carros[i].mostrarInfo();
            System.out.println("***********************");
        }
       
    }
}
