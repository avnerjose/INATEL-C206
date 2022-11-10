package conexaobd.DAO;

import conexaobd.model.Filme;
import java.sql.SQLException;
import java.util.ArrayList;

public class FilmeDAO extends ConnectionDAO {

    boolean sucesso = false;

    public boolean inserirFilme(Filme filme) {
        connectToDB();
        String sql = "INSERT INTO filme (nome, diretor, genero,preco) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, filme.nome);
            pst.setString(2, filme.diretor);
            pst.setString(3, filme.genero);
            pst.setFloat(4, filme.preco);
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    public boolean atualizarFilme(int id, Filme filme) {
        connectToDB();
        String sql = "UPDATE filme SET nome=?, diretor=?, genero=?, preco=? where id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, filme.nome);
            pst.setString(2, filme.diretor);
            pst.setString(3, filme.genero);
            pst.setFloat(4, filme.preco);
            pst.setInt(5, id);
            pst.execute();
            sucesso = true;

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deletarFilme(int id) {
        connectToDB();
        String sql = "DELETE FROM filme where id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public ArrayList<Filme> buscarFilmes() {
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        connectToDB();

        String sql = "SELECT * FROM filme";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de filmes");
            while (rs.next()) {
                Filme filmeAux = new Filme();

                filmeAux.id = rs.getInt("id");
                filmeAux.nome = rs.getString("nome");
                filmeAux.diretor = rs.getString("diretor");
                filmeAux.genero = rs.getString("genero");
                filmeAux.preco = rs.getFloat("preco");
                listaDeFilmes.add(filmeAux);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return listaDeFilmes;
    }

    public Filme buscarFilmePorId(int id) {
        Filme filmeAux = null;

        connectToDB();

        String sql = "SELECT * FROM filme WHERE id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            while (rs.next()) {
                String aux = rs.getString("nome");
                if (aux.isEmpty()) {
                    return filmeAux;
                } else {
                    filmeAux = new Filme();
                    filmeAux.id = rs.getInt("id");
                    filmeAux.nome = rs.getString("nome");
                    filmeAux.diretor = rs.getString("diretor");
                    filmeAux.genero = rs.getString("genero");
                    filmeAux.preco = rs.getFloat("preco");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return filmeAux;

    }
}
