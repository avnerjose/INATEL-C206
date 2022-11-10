package excal;

public class Calculadora {
    public static double PI = 3.14; 
        
    public static double circumferencia(double raio){
        return PI*Math.pow(raio,2); 
    }
    
    public static double volume(double raio){
        double vol;
        
        vol = (4.0/3.0)*PI*Math.pow(raio,3); 
       
        return vol; 
    }
}   
