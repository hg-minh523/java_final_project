package collision;


import entity.Product;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hgmin
 */
public class productCollection {

    public ArrayList<Product> list = new ArrayList<Product>();

    public productCollection() {
    }

    public void add(Product pd) {
        list.add(pd);
    }
    
    public ArrayList<Product> getList(){
        return this.list;
    }

}
