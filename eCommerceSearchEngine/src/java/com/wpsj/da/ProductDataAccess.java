/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wpsj.da;

import com.wpsj.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ProductDataAccess {
    private PreparedStatement searchStatement;
    
    private PreparedStatement getSearchStatement() throws SQLException{
    if(searchStatement==null){
        Connection conn = new DBConnection().getConnection();
        searchStatement = conn.prepareStatement("SELECT id,name,descs FROM Products WHERE name like ?");
    }
    return searchStatement;
}
    public List<Product> getProductsByName(String name){
        try{
            PreparedStatement statement = getSearchStatement();
            statement.setString(1, "%"+name+"%");
            ResultSet rs = statement.executeQuery();
            List<Product> pros = new LinkedList<Product>();
            while (rs.next()) {                
                pros.add(new Product(rs.getInt("id"),rs.getString("name"),rs.getString("descs")));
            }
            return pros;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
        
    }
}
