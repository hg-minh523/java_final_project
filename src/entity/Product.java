/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author hgmin
 */
public class Product {
private String id;
private String name;
private String description;
private double price;
private String image;
private double vat;
private double origin_price;
private Categoryes category;
private LocalDate create_at;
//private LocalDate delete_at;
//private LocalDate update_at;

    public Product() {
    }
    
    public Product(String id) {
        this.id = id;
    }
//, LocalDate delete_at, LocalDate update_at
    public Product(String id, String name, String description, double price, String image, double vat, double origin_price, Categoryes category, LocalDate create_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.vat = vat;
        this.origin_price = origin_price;
        this.category = category;
        this.create_at = create_at;
//        this.delete_at = delete_at;
//        this.update_at = update_at;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public double getVat() {
        return vat;
    }

    public double getOrigin_price() {
        return origin_price;
    }

    public Categoryes getCategory() {
        return category;
    }

    public LocalDate getCreate_at() {
        return create_at;
    }

//    public LocalDate getDelete_at() {
//        return delete_at;
//    }
//
//    public LocalDate getUpdate_at() {
//        return update_at;
//    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public void setOrigin_price(double origin_price) {
        this.origin_price = origin_price;
    }

    public void setCategory(Categoryes category) {
        this.category = category;
    }

    public void setCreate_at(LocalDate create_at) {
        this.create_at = create_at;
    }

//    public void setDelete_at(LocalDate delete_at) {
//        this.delete_at = delete_at;
//    }
//
//    public void setUpdate_at(LocalDate update_at) {
//        this.update_at = update_at;
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return Objects.equals(this.id, other.id);
    }


   
  
}
