package redessociais;

public class Usuario {
    private String nome;
    private String email; 
    RedeSocial[] redesSociais; 
    
    Usuario(String nome,String email, RedeSocial[] redesSociais){
        this.nome = nome; 
        this.email = email; 
        this.redesSociais = redesSociais; 
    }
    
    
}
