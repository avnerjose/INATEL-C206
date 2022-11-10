/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd.DAO;

import conexaobd.model.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PICHAU
 */
public class PessoaDAO extends ConnectionDAO{
    boolean sucesso = false;
    
    public boolean inserirPessoa(Pessoa pessoa) {
        connectToDB();
        String sql = "INSERT INTO Pessoa (nome, idade, altura) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(3, pessoa.altura);
            pst.setString(1, pessoa.nome);
            pst.setInt(2, pessoa.idade);
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        
        return sucesso;
    }
    
    public boolean atualizarPessoa(int id, Pessoa pessoa) {
        connectToDB();
        String sql = "UPDATE Pessoa SET nome=?, idade=?, altura=? where id=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, pessoa.nome);
            pst.setInt(2, pessoa.idade);
            pst.setFloat(3, pessoa.altura);
            pst.setInt(4, id);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public boolean deletarPessoa(int id) {
        connectToDB();
        String sql = "DELETE FROM Pessoa where id=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
}
