/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wpsj.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DBConnection {
    private static Connection connection;
    
    public Connection getConnection() throws SQLException{
        if(connection==null){
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/MyProduct","sa","sa");
        }
        return connection;
    }
    
    public static void main(String[] args) throws SQLException {
       
    }
}
