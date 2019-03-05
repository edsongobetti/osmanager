package br.com.chessdevelopment.dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.chessdevelopment.model.UsuarioModel;


public class UsuarioDao {
    
    Connection conector = ConnectionDB.conexao();
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String querySql = null;
    MessageDigest md;

    public String logarUsuario(String usuario, String senha) throws SQLException {
        
        querySql = "SELECT * FROM tb_usuarios WHERE login_user=? AND senha_user=?";
        
        try {
            
            md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes(), 0, senha.length());
            BigInteger senhaCripto = new BigInteger(1, md.digest());
            senha = String.format("%1$032X", senhaCripto);
            
            pst = conector.prepareStatement(querySql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            
            rs = pst.executeQuery();
            
            if(rs.next()) {
                
                String nivelUser = rs.getString(5);
                String statusUser = rs.getString(6);
                
                if (nivelUser.equals("Administrador") && statusUser.equals("A")) {
                    
                    return "adminUser";
                    
                } else if (nivelUser.equals("Colaborador") && statusUser.equals("A")) {
                    
                    return "colaboradorUser";
                    
                } else if (statusUser.equals("I")) {
                    
                    return "userInativo";
                    
                }
                              
            } else {
                
                return "Desconectado";

            }
            
        }catch (Exception ex) {
            
            return "Erro SQL: "+ex;

        }
        
        return null;
             
    }
    
    public String retornoUser(String usuario, String senha) {
        
        querySql = "SELECT * FROM tb_usuarios WHERE login_user=? AND senha_user=?";
        
        try{
            
            md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes(), 0, senha.length());
            BigInteger senhaCripto = new BigInteger(1, md.digest());
            senha = String.format("%1$032X", senhaCripto);
        
            pst = conector.prepareStatement(querySql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
            
                String loginUsuario = rs.getString(2);
            
                return loginUsuario;
            
            }
            
        }catch(Exception ex) {
            
            return "Erro no login de usuário.";
            
        }     
        
        return null;
        
    }
    
    public UsuarioModel consultaUsuario(String nome) {
        
        UsuarioModel usuario = new UsuarioModel();
        
        querySql = "SELECT * FROM tb_usuarios WHERE nome_user LIKE '%?%';";
        
        try {
            
            pst = conector.prepareStatement(querySql);
            pst.setString(1, nome);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                
                usuario.setIdUser(Integer.parseInt(rs.getString(1)));
                usuario.setNomeUser(rs.getString(2));
                usuario.setLoginUser(rs.getString(3));
                usuario.setSenhaUser(rs.getString(4));
                usuario.setNivelUser(rs.getString(5));
                char[] statusRetorno = rs.getString(6).toCharArray();
                char retorno = statusRetorno[0];
                usuario.setStatusUser(retorno);
                
                System.out.println(usuario.getLoginUser());
                System.out.println(usuario.getNomeUser());
                
                //return usuario;
                
            }
            
            
        }catch(Exception ex) {
           
            return null;
                        
        }
        
        return usuario;
        
    }
    
}