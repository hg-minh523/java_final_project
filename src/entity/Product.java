/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author hgmin
 */
public class Product {

    int id;
    String name;
    String image;
    float price;

    public Product(int id, String name, String image, float price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    
    public String getImage(){
        return this.image;
    }
    
    public float getPrice(){
        return this.price;
    }

  
}
