/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author KHONG TAM
 */
public class Invoice_detail {
    
    private Product product;
    private int quantity;
    private Invoices invoices;
    

    public Invoice_detail() {
       
    }

    public Invoice_detail(Product product, int quantity, Invoices invoices) {
        this.product = product;
        this.quantity = quantity;
        this.invoices = invoices;
    }

    public Invoices getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoices invoices) {
        this.invoices = invoices;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double caculatorEachItem(){
        return (product.getPrice()*quantity)+product.getVat()*(product.getPrice()*quantity);
    }
    
}
