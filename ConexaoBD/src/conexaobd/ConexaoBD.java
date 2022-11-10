/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd;

import conexaobd.model.Filme;
import conexaobd.DAO.FilmeDAO;
import java.util.ArrayList;

/**
 *
 * @author PICHAU
 */
public class ConexaoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Filme> filmes = new ArrayList<>(); 
        Filme f1 = new Filme(); 
        f1.nome = "Harry Potter e as Reliquias da Morte";
        f1.genero = "Fantasia"; 
        f1.diretor = "David Yates"; 
        f1.preco = 34.5F;
        Filme f2 = new Filme();
        f2.nome = "Seven"; 
        f2.genero = "Investigacao"; 
        f2.diretor = "David Linch"; 
        f2.preco = 23F;
        
        Filme filmeAux = new Filme(); 
        
        FilmeDAO fConnection = new FilmeDAO(); 
        
     /*  if(fConnection.inserirFilme(f1)){
           System.out.println("Filme adicionado com sucesso!");
       }else{
           System.out.println("Filme nao pode ser inserido");
       }
       if(fConnection.inserirFilme(f2)){
           System.out.println("Filme adicionado com sucesso!");
       }else{
           System.out.println("Filme nao pode ser inserido");
       }*/
       
      // filmes = fConnection.buscarFilmes();
       
      /*  for (int i = 0; i < filmes.size(); i++) {
            System.out.println("ID: " + filmes.get(i).id);
            System.out.println("Nome: " + filmes.get(i).nome);
            System.out.println("Diretor: " + filmes.get(i).diretor);
            System.out.println("Genero: " + filmes.get(i).genero);
            System.out.println("Preço: R$" + filmes.get(i).preco);
        }*/
        
        filmeAux = fConnection.buscarFilmePorId(1);
        
        if(filmeAux != null){
            System.out.println("ID: " + filmeAux.id);
            System.out.println("Nome: " + filmeAux.nome);
            System.out.println("Diretor: " + filmeAux.diretor);
            System.out.println("Genero: " + filmeAux.genero);
            System.out.println("Preco: " + filmeAux.preco);
        }else{
            System.out.println("Filme nao encontrado");
        }
       
       //f1.nome = "Harry Potter e o Enigma do Principe"; 
       
       /*if(fConnection.atualizarFilme(1, f1)){
           System.out.println("Filme modificado com sucesso");
       }else{
           System.out.println("Filme nao pode ser modificado");
       }; */
       
       /*if(fConnection.deletarFilme(2)){
           System.out.println("Filme deletado com sucesso");
       }else{
           System.out.println("Filme nao pode ser deletado");
       }*/
       
        
    }
    
}
