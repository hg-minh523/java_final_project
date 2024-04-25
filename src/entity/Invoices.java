/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author KHONG TAM
 */
public class Invoices {
   
    private String id;
   
    private LocalDate credate_at;
    private Employee employee;
    private Customer customer;
    private LocalDate delete_at;
    private LocalDate upadte_at;
    private String description;
    private Invoice_detail indetail;

    public Invoices(String id) {
        this.id = id;
    }

    public Invoices(String id, LocalDate credate_at, Employee employee, Customer customer, LocalDate delete_at, LocalDate upadte_at, String description, Invoice_detail indetail) {
        this.id = id;
        this.credate_at = credate_at;
        this.employee = employee;
        this.customer = customer;
        this.delete_at = delete_at;
        this.upadte_at = upadte_at;
        this.description = description;
        this.indetail = indetail;
    }

    

    public Invoice_detail getindetail() {
        return indetail;
    }

    public void setList_indetail(Invoice_detail indetail) {
        this.indetail = indetail;
    }

    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public String getId() {
        return id;
    }

   

    public LocalDate getCredate_at() {
        return credate_at;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDelete_at() {
        return delete_at;
    }

    public LocalDate getUpadte_at() {
        return upadte_at;
    }

    public void setId(String id) {
        this.id = id;
    }

   
    public void setCredate_at(LocalDate credate_at) {
        this.credate_at = credate_at;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDelete_at(LocalDate delete_at) {
        this.delete_at = delete_at;
    }

    public void setUpadte_at(LocalDate upadte_at) {
        this.upadte_at = upadte_at;
    }
    

    
    

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Invoices other = (Invoices) obj;
        return Objects.equals(this.id, other.id);
    }
    public double caculatorTotal(){
        double toatl=0;
        
            toatl=toatl+  indetail.caculatorEachItem();
        
        return  toatl;
    }
    
}
