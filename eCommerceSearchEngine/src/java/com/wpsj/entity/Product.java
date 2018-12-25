/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wpsj.entity;

/**
 *
 * @author HP
 */
public class Product {
    private int id;
    private String name;
    private String descs;

    public Product(int id, String name, String descs) {
        this.id = id;
        this.name = name;
        this.descs = descs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    @Override
    public String toString() {
        return "Product {"+ "id=" + id + ", name=" + name + ", descs=" + descs + "'}'";  
    }
    
    
}
