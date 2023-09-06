
package br.com.senac.cenaflixjpa.DAO;

import Util.JPAUtil;
import br.com.senac.cenaflixjpa.persistencia.Cadastro_Usuario;
import jakarta.persistence.EntityManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroUsuarioDAO {
    
    public void cadastrar(Cadastro_Usuario c){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(c);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEtityManager();
          }
      }
     public static Cadastro_Usuario validarUsuarioSeguro(Cadastro_Usuario usuario) {
            // Criando consulta parametrizada
            String sql = "SELECT * FROM cadastro_usuario WHERE login_usuario = ? AND senha_hash = ?";
            
            Cadastro_Usuario usuarioEncontrado = null;

            try {
                Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/atividadecenaflix", "root", "admin");
                PreparedStatement statement = conexao.prepareStatement(sql);

                // Atribuindo os valores na consulta
                statement.setString(1, usuario.getLogin_usuario());
                statement.setString(2, usuario.getSenha_hash());
                
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    usuarioEncontrado = new Cadastro_Usuario();
                    usuarioEncontrado.setId(rs.getInt("id"));
                    usuarioEncontrado.setNome(rs.getString("nome"));
                    usuarioEncontrado.setLogin_usuario(rs.getString("login_usuario"));
                    usuarioEncontrado.setSenha_hash(rs.getString("senha_hash"));
                    usuarioEncontrado.setPerfil(rs.getString("perfilUsuario"));
                }
            } catch (SQLException ex) {
                System.out.println("Sintaxe de comando invalida");
            }

            return usuarioEncontrado;
        }
}
