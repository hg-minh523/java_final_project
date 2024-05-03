/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Dell
 */
public class Account {
    private String username;
    private String password;
    private Employee emp;

    public Account() {
    }
    public Account(String username) {
        this.username = username;
    }
    public Account(String username, String password, Employee emp) {
        this.username = username;
        this.password = password;
        this.emp = emp;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
    
    
    
    
}
