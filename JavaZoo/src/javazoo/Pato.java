package javazoo;

public class Pato extends Animal {
   private float tamanhoBico;

    public float getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
   
   
   @Override
   public void fazBarulho(){
       System.out.println("Quak Quak");
   } 
}
