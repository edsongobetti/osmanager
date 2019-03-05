package br.com.chessdevelopment.dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionDB {
    
    public static Connection conexao () {
        
        Connection conector = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/db_osmanager";
        String user = "admchess";
        String pwd = "$$adm99";
        
        try {
            Class.forName(driver);
            conector = DriverManager.getConnection(url, user, pwd);
            return conector;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com banco de dados: "+ex);
            return null;
        }
        
    }
    
}
