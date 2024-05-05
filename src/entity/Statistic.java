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
public class Statistic {

    private ArrayList<String> name;
    private ArrayList<String> revenue;

    public Statistic() {

    }

    public void addName(String name) {
        this.name.add(name);
    }

    public void addRevenue(String revenue) {
        this.name.add(revenue);
    }

    public ArrayList<String> getListName() {
        return this.name;
    }

    public ArrayList<String> getListRevenue() {
        return this.revenue;
    }
    
    public void reset(){
        this.name.clear();
        this.revenue.clear();
    }
}
