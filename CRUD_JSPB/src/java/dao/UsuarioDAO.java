package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

/**
 *
 * @author LoboMau
 */
public class UsuarioDAO {

    private Connection connection;

    String login;
    String senha;
    String perfil;
    String email;

    public UsuarioDAO() {

        this.connection = new ConnectionFactory().getConnection();

    }

    public boolean inserir(Usuario usuario) {

        String sql = "INSERT INTO usuario(login,senha,perfil,email) VALUES(?,?,?,?)";
        boolean retorno = false;
       

        try {
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, usuario.getLogin());
            pst.setString(2, usuario.getSenha());
            pst.setString(3, usuario.getPerfil());
            pst.setString(4, usuario.getEmail());

            if (pst.executeUpdate()> 0) {
                retorno = true;
            }
            
            pst.execute();
            pst.close();


        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }

        return retorno;

    }

    public boolean atualizar(Usuario usuario) {
        String sql = "UPDATE usuario set senha=?,perfil=?,email=? where login=?";
        Boolean retorno = false;
        PreparedStatement pst = null;

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, usuario.getSenha());
            pst.setString(2, usuario.getPerfil());
            pst.setString(3, usuario.getEmail());
            pst.setString(4, usuario.getLogin());
            if (pst.executeUpdate() > 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }

        return retorno;

    }

    public boolean excluir(Usuario usuario) throws SQLException {
        String sql = "DELETE FROM usuario where login=?";
        Boolean retorno = false;
        PreparedStatement pst = connection.prepareStatement(sql);
        try {

            pst.setString(1, usuario.getLogin());
            if (pst.executeUpdate() > 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }

        return retorno;

    }

    public List<Usuario> listar() throws Exception {

        String sql = "SELECT * FROM usuario";
        List<Usuario> retorno = new ArrayList<Usuario>();

        PreparedStatement pst = connection.prepareStatement(sql);

        try {

            ResultSet res = pst.executeQuery();
            while (res.next()) {

                Usuario item = new Usuario();
                item.setLogin(res.getString("login"));
                item.setSenha(res.getString("senha"));
                item.setEmail(res.getString("email"));
                item.setPerfil(res.getString("perfil"));

                retorno.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return retorno;

    }

    public Usuario buscar(Usuario usuario) throws SQLException {
        String sql = "SELECT * FROM usuario where login=?";
        Usuario retorno = null;

        PreparedStatement pst = connection.prepareStatement(sql);
        try {

            pst.setString(1, usuario.getLogin());
            ResultSet res = pst.executeQuery();

            if (res.next()) {
                retorno = new Usuario();
                retorno.setLogin(res.getString("login"));
                retorno.setSenha(res.getString("senha"));
                retorno.setEmail(res.getString("email"));
                retorno.setPerfil(res.getString("perfil"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return retorno;

    }

}
