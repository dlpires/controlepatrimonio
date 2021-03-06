/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import bean.Usuario;

/**
 *
 * @author Matheus Henrique
 */
public class UsuarioDAO {
    
    public static boolean doLogin(String user, String pass){
        boolean valid = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT login_usuario FROM usuario WHERE login_usuario = ? and senha_usuario = ?");
            stmt.setString(1, user);
            stmt.setString(2, pass);
            rs = stmt.executeQuery();
            while (rs.next()) {
              valid = true; 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return valid;
        
    }
    
    public static boolean existsByUser(String user){
        boolean valid = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT login_usuario FROM usuario WHERE login_usuario = ?");
            stmt.setString(1, user);
            rs = stmt.executeQuery();
            while (rs.next()) {
              valid = true; 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return valid;
        
    }
    
    public static String existsByName(String name){
        String nameFound = "";
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT login_usuario FROM usuario WHERE nome_usuario = ?");
            stmt.setString(1, name);
            rs = stmt.executeQuery();
            while (rs.next()) {
              nameFound = rs.getString("login_usuario"); 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return nameFound;
        
    }

    public static Usuario load(Usuario usuario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login_usuario = ?");
            stmt.setString(1, usuario.getLoginUsuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
              return UsuarioDAO.createInstance(rs); 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuario;
    }
    
    public static Usuario load(String login) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login_usuario = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            while (rs.next()) {
              return UsuarioDAO.createInstance(rs); 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return new Usuario();
    }

    public static ArrayList<Usuario> readAll() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuariosList = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                usuariosList.add(UsuarioDAO.createInstance(rs));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuariosList;
    }

    public static void save(Usuario usuario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE usuario SET  senha_usuario = ?, conf_senha_usuario = ?, nome_usuario = ?, funcao_usuario = ?, cell_usuario = ?, nivel_Acesso = ? WHERE login_usuario= ?");
            stmt.setString(1, usuario.getSenhaUsuario());
            stmt.setString(2, usuario.getConfSenhaUsuario());
            stmt.setString(3, usuario.getNomeUsuario());
            stmt.setString(4, usuario.getFuncaoUsuario());
            stmt.setString(5, usuario.getCellUsuario());
            stmt.setInt(6, usuario.getNivelAcesso());
            stmt.setString(7, usuario.getLoginUsuario());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Atualização: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public static void create(Usuario usuario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO usuario (login_usuario,senha_usuario,conf_senha_usuario,nome_usuario,funcao_usuario,cell_usuario,nivel_Acesso) VALUES (?,?,?,?,?,?,?)");
           stmt.setString(1, usuario.getLoginUsuario());
            stmt.setString(2, usuario.getSenhaUsuario());
            stmt.setString(3, usuario.getConfSenhaUsuario());
            stmt.setString(4, usuario.getNomeUsuario());
            stmt.setString(5, usuario.getFuncaoUsuario());
            stmt.setString(6, usuario.getCellUsuario());
            stmt.setInt(7, usuario.getNivelAcesso());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Gravação: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public static void delete(Usuario usuario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE login_usuario = ?");
            stmt.setString(1, usuario.getLoginUsuario());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Exclusão: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public static Usuario createInstance(ResultSet result) {
        Usuario usuario = new Usuario();

        try {
            usuario.setLoginUsuario(result.getString("login_usuario"));
            usuario.setSenhaUsuario(result.getString("senha_usuario"));
            usuario.setConfSenhaUsuario(result.getString("conf_senha_usuario"));
            usuario.setNomeUsuario(result.getString("nome_usuario"));
            usuario.setFuncaoUsuario(result.getString("funcao_usuario"));
            usuario.setCellUsuario(result.getString("cell_usuario"));
            usuario.setNivelAcesso(result.getInt("nivel_Acesso"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao criar instância de Patrimônio: " + ex.getMessage());
        }

        return usuario;
    }

}
