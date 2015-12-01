/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulocampanha
 */
public class AcessoMySql {
    
    Connection conn;
    
    /*Trecho utilizado para testar a conexão com o banco
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static void main(String args[]){
            new acessoMySql();
    }
    
    public acessoMySql(){
        conectar();
    }
    */
    
    public Connection conectar(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/control_art?user=root&password=");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AcessoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
        
    }
    
    public void desconectar(){
        
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AcessoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
}
