package redessociais;

public class RedesSociais {

    public static void main(String[] args) {
       RedeSocial[] redesSociais = new RedeSocial[4]; 
       redesSociais[0] = new Facebook();
       redesSociais[1] = new GooglePlus();
       redesSociais[2] = new Instagram();
       redesSociais[3] = new Twitter();
       
       Usuario user = new Usuario("Avner Jose","avner.jose@inatel.com",redesSociais);  
       
       for(int i=0;i<4;i++){
           switch(i){
               case 0:
                   Facebook f = (Facebook)user.redesSociais[i];
                   f.compartilhar(); 
                   break;
               case 1:
                   GooglePlus g = (GooglePlus)user.redesSociais[i];
                   g.fazStreaming();
                   break;
               case 2: 
                   user.redesSociais[i].postarComentario();
                   break;
               case 3: 
                   user.redesSociais[i].postarVideo(); 
                   break; 
           }
       }
       
    }
}
