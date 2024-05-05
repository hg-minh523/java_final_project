/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import ConnectDb.databaseConnection;
import entity.Categoryes;
import entity.Customer;
import entity.Invoice_detail;
import entity.Invoices;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHONG TAM
 */
public class Invoicesdetail_DAO {
        private ArrayList<Invoice_detail> listIndetail;
    private Connection con = null;
    private databaseConnection ConnectDB = new databaseConnection();

 public ArrayList<Invoice_detail> getlist_Invoidetail(String id) {
        listIndetail = new ArrayList<Invoice_detail>();

        con = ConnectDB.getConnection();
        PreparedStatement statement = null;

        try {
            statement = con.prepareStatement("   select *  from invoice_detail a join products b on a.product_id=b.id where a.invoice_id=?");
                       statement.setString(1,id );

            ResultSet rs = statement.executeQuery();

//            Invoices receipt = null;
            while (rs.next()) {
                Product pro;
                pro = new Product(rs.getString("id"), rs.getNString("name"), rs.getNString("description"), rs.getDouble("price"), rs.getString("image"), rs.getDouble("vat"), rs.getDouble("origin_price"), new Categoryes(rs.getString("category_id")), LocalDate.parse(rs.getString("create_at")));
                    Invoice_detail inv=new Invoice_detail(pro,rs.getInt("quantity"), new Invoices(rs.getString("invoice_id")));
//                    System.out.println(inv);
            listIndetail.add(inv);
            }
            return listIndetail;
        } catch (SQLException e) {
        }
        return null;

    }
 
 public boolean addInvoiceDetail(Invoice_detail de){
     int rs = 0;
        try {
            
            con = ConnectDB.getConnection();
            String sql = " insert into invoice_detail values(?,?,?)";
            PreparedStatement pr = null;
            pr = con.prepareStatement(sql);
            pr.setString(1, de.getInvoices().getId());
            pr.setString(2, de.getProduct().getId());
            pr.setInt(3, de.getQuantity());
            rs = pr.executeUpdate();
        } catch (SQLException ex) {
        }
        return rs > 0;
    }
 }






